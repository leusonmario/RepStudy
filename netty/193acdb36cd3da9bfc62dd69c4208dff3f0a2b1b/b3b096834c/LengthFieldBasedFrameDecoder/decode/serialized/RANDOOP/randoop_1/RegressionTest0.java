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
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 0, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = org.jboss.netty.channel.Channel.OP_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer298();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline4 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline8();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        boolean boolean3 = dynamicChannelBuffer2.readable();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.readBytes(outputStream5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer4.bytesBefore((int) (byte) 100, (-1), channelBufferIndexFinder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline3 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline7();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer65();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        dynamicChannelBuffer4.writeFloat((float) 'a');
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = bigEndianHeapChannelBuffer3.readSlice((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter7 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter7.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer178();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter12 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter12.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter12.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel15 = serializedObjectSupporter12.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder16 = serializedObjectSupporter12.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = serializedObjectSupporter12.deserializeObjectDynamicChannelBuffer284();
        int int18 = dynamicChannelBuffer11.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer6.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(objectDecoder14);
        org.junit.Assert.assertNotNull(embeddedChannel15);
        org.junit.Assert.assertNotNull(objectDecoder16);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer290();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        int int5 = dynamicChannelBuffer4.readUnsignedShort();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer4.getUnsignedShort((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer210();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter4 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter4.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter4.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter4.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter4.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter4.deserializeObjectDynamicChannelBuffer43();
        dynamicChannelBuffer2.getBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, 100, (int) ' ');
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer28();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer185();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer98();
        float float8 = dynamicChannelBuffer6.getFloat(10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.8038722E22f + "'", float8 == 1.8038722E22f);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.MessageEvent messageEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder6.messageReceived(channelHandlerContext7, messageEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder425();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer199();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder181();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer325();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter7 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer189();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.readBytes((org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder6.handleUpstream(channelHandlerContext7, channelEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer300();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer178();
        dynamicChannelBuffer4.readerIndex(100);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer61();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer223();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer5.setBytes(0, inputStream7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer158();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder7.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer220();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        short short3 = bigEndianHeapChannelBuffer1.getUnsignedByte((int) (byte) 0);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder496();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int0 = org.jboss.netty.channel.Channel.OP_READ_WRITE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer415();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer49();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        boolean boolean10 = bigEndianHeapChannelBuffer9.writable();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int0 = org.jboss.netty.channel.Channel.OP_READ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer33();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer323();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer247();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer80();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer411();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer4.readSlice((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer273();
        dynamicChannelBuffer5.writeByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer58();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter7 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer150();
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer5.getBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder319();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder41();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer249();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        long long6 = bigEndianHeapChannelBuffer4.getUnsignedInt((int) '4');
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1852925047L + "'", long6 == 1852925047L);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer238();
        dynamicChannelBuffer5.writeShort((-1));
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer252();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer412();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer387();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer155();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder371();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder37();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer315();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel5 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel8();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.ChannelFuture channelFuture7 = embeddedChannel5.setInterestOps((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid interestOps: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(embeddedChannel5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer223();
        dynamicChannelBuffer5.writeByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer62();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer137();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        bigEndianHeapChannelBuffer5.setBoolean((int) '4', true);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer98();
        char char7 = dynamicChannelBuffer6.readChar();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer27();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        dynamicChannelBuffer4.writeByte((int) (byte) 1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer188();
        boolean boolean6 = dynamicChannelBuffer5.readable();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer75();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder746();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer207();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer396();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer188();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer5.writeBytes(scatteringByteChannel6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer162();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer231();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder72();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer368();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer190();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer167();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer402();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer371();
        java.lang.Class<?> wildcardClass8 = dynamicChannelBuffer7.getClass();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer316();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer317();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer158();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer282();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer220();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer376();
        int int6 = dynamicChannelBuffer5.readableBytes();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18071 + "'", int6 == 18071);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer110();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder17();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder132();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer104();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer398();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer260();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer29();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer88();
        dynamicChannelBuffer4.writeChar(32768);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer204();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer367();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter6 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter6.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter6.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter6.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter6.deserializeObjectDynamicChannelBuffer98();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter13 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter13.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder15 = serializedObjectSupporter13.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder16 = serializedObjectSupporter13.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer17 = serializedObjectSupporter13.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder18 = serializedObjectSupporter13.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer19 = serializedObjectSupporter13.deserializeObjectBigEndianHeapChannelBuffer153();
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer19, (int) ' ', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer4.getBytes((-1), (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer14);
        org.junit.Assert.assertNotNull(objectDecoder15);
        org.junit.Assert.assertNotNull(objectDecoder16);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer17);
        org.junit.Assert.assertNotNull(objectDecoder18);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer19);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer371();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer376();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer3.readSlice((int) '\000');
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(channelBuffer5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder181();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer129();
        int int7 = dynamicChannelBuffer6.readableBytes();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6866 + "'", int7 == 6866);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        short short12 = bigEndianHeapChannelBuffer10.getUnsignedByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 99 + "'", short12 == (short) 99);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer262();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer433();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer64();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter6 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter6.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter6.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter6.deserializeObjectDynamicChannelBuffer204();
        int int11 = bigEndianHeapChannelBuffer5.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer118();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dynamicChannelBuffer4.toString((int) (byte) 0, (int) (short) -1, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer240();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer260();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer197();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder484();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer395();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder359();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer292();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer86();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer6.writeChar((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 371");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder319();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder41();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer289();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer4();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer303();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline4 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline9();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder18();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder478();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer70();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel5 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel8();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter6 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter6.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter6.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress10 = serializedObjectSupporter6.deserializeObjectSocketAddress1();
        org.jboss.netty.channel.ChannelFuture channelFuture11 = embeddedChannel5.connect((java.net.SocketAddress) embeddedSocketAddress10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(embeddedChannel5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(embeddedSocketAddress10);
        org.junit.Assert.assertNotNull(channelFuture11);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer393();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer118();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = bigEndianHeapChannelBuffer3.indexOf(10, 1, channelBufferIndexFinder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer115();
        byte[] byteArray9 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.writeBytes(byteArray9, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer170();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer395();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel5 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel3();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer355();
        java.nio.ByteBuffer byteBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.readBytes(byteBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(embeddedChannel5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer412();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer204();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer156();
        dynamicChannelBuffer5.writeLong((long) 1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer114();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer127();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer279();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder290();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder359();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder138();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder771();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder270();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer117();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        int int6 = bigEndianHeapChannelBuffer5.readerIndex();
        bigEndianHeapChannelBuffer5.resetReaderIndex();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer157();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer318();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer175();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 100, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder746();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer318();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer86();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer36();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder3.channelClosed(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer318();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder162();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        int int5 = dynamicChannelBuffer4.readMedium();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder729();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer329();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer299();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer403();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer123();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer195();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer231();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder72();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer21();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        dynamicChannelBuffer5.skipBytes(5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder56();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer266();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder357();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder367();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer372();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer275();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder641();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer434();
        // The following exception was thrown during execution in test generation
        try {
            char char10 = bigEndianHeapChannelBuffer8.getChar(6866);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6866");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer90();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer249();
        org.junit.Assert.assertNotNull(objectDecoder1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer325();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer143();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter8 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter8.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter8.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer397();
        dynamicChannelBuffer6.getBytes((int) '\000', (org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer14);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer98();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter7 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter7.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter7.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter7.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer153();
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer13, (int) ' ', (int) (short) 10);
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter17 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer18 = serializedObjectSupporter17.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder19 = serializedObjectSupporter17.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder20 = serializedObjectSupporter17.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer21 = serializedObjectSupporter17.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder22 = serializedObjectSupporter17.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = serializedObjectSupporter17.deserializeObjectDynamicChannelBuffer98();
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer18);
        org.junit.Assert.assertNotNull(objectDecoder19);
        org.junit.Assert.assertNotNull(objectDecoder20);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer21);
        org.junit.Assert.assertNotNull(objectDecoder22);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer23);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer19();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer359();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer360();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer86();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer400();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer379();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder641();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer434();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer61();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        dynamicChannelBuffer6.writeShort((int) (byte) 0);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer129();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder107();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer216();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer117();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer149();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer374();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer40();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer118();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer7();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer251();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer209();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer424();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer5.slice();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder767();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder270();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer183();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer188();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder616();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer340();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer7.readBytes(outputStream8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer180();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer148();
        dynamicChannelBuffer7.setLong((int) (short) 10, 10L);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer79();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder524();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer238();
        int int6 = dynamicChannelBuffer5.arrayOffset();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer6();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter11 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter11.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter11.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter11.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = serializedObjectSupporter11.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = serializedObjectSupporter11.deserializeObjectDynamicChannelBuffer376();
        java.nio.ByteBuffer byteBuffer19 = dynamicChannelBuffer16.toByteBuffer((int) (short) 1, (int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.setBytes((-1), byteBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(objectDecoder14);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer15);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer16);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder323();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder35();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer62();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer364();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer239();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder148();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer260();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setBytes(5, byteArray13, (int) (byte) 0, (int) (short) 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 10, 1, 100, 100, -1]");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder371();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer413();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder746();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer402();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline5 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline10();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer291();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer246();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = bigEndianHeapChannelBuffer2.bytesBefore((int) ' ', channelBufferIndexFinder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer117();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer367();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer310();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer396();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer134();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder641();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer123();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder17();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder675();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer76();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder359();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder761();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder9.channelOpen(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder771();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer60();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer318();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer214();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder411();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer28();
        java.nio.channels.GatheringByteChannel gatheringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer4.getBytes(0, gatheringByteChannel6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter2 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter2.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter2.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel5 = serializedObjectSupporter2.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter2.deserializeObjectBigEndianHeapChannelBuffer247();
        int int7 = bigEndianHeapChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer6);
        bigEndianHeapChannelBuffer6.discardReadBytes();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(embeddedChannel5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer320();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder68();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer280();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder296();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer337();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        boolean boolean11 = bigEndianHeapChannelBuffer10.readBoolean();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer4.writeBytes(inputStream5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder750();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder8.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer267();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer391();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer9();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter11 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter11.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter11.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter11.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter15 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer16 = serializedObjectSupporter15.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder17 = serializedObjectSupporter15.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel18 = serializedObjectSupporter15.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder19 = serializedObjectSupporter15.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder20 = serializedObjectSupporter15.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder21 = serializedObjectSupporter15.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer22 = serializedObjectSupporter15.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = serializedObjectSupporter15.deserializeObjectDynamicChannelBuffer382();
        dynamicChannelBuffer14.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23);
        dynamicChannelBuffer9.getBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, (int) (short) 100, (int) 'a');
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = dynamicChannelBuffer14.indexOf((int) (short) 10, 32768, channelBufferIndexFinder30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer16);
        org.junit.Assert.assertNotNull(objectDecoder17);
        org.junit.Assert.assertNotNull(embeddedChannel18);
        org.junit.Assert.assertNotNull(objectDecoder19);
        org.junit.Assert.assertNotNull(objectDecoder20);
        org.junit.Assert.assertNotNull(objectDecoder21);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer22);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer23);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer123();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer92();
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setBytes((int) (short) -1, byteArray7, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder647();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder323();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer177();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer48();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer3.factory();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer93();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer366();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer320();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder68();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer70();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder302();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer388();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer210();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder486();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer235();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder207();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer116();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter9 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter9.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter9.deserializeObjectObjectDecoder793();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer89();
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer8.writeBytes((org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer54();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer295();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer123();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer92();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer5.setBytes(1, inputStream7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer298();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer12);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer217();
        long long10 = dynamicChannelBuffer9.readUnsignedInt();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 83L + "'", long10 == 83L);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer78();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer309();
        int int9 = dynamicChannelBuffer6.bytesBefore((int) (short) 0, (byte) 0);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer306();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer123();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer157();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer187();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer55();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder319();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder294();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer367();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder17();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer348();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline8 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline5();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer353();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder224();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer357();
        boolean boolean7 = dynamicChannelBuffer6.hasArray();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer324();
        bigEndianHeapChannelBuffer5.clear();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer48();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.readBytes(outputStream4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer266();
        dynamicChannelBuffer5.writeMedium(0);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        java.nio.channels.GatheringByteChannel gatheringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer4.getBytes((int) ' ', gatheringByteChannel6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel5 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel8();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter6 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter6.deserializeObjectObjectDecoder411();
        boolean boolean10 = embeddedChannel5.equals((java.lang.Object) objectDecoder9);
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter11 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter11.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter11.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter11.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter11.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel16 = serializedObjectSupporter11.deserializeObjectEmbeddedChannel3();
        int int17 = embeddedChannel5.compareTo((org.jboss.netty.channel.Channel) embeddedChannel16);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(embeddedChannel5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer14);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer15);
        org.junit.Assert.assertNotNull(embeddedChannel16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder853();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer411();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer237();
        dynamicChannelBuffer8.writeMedium(100);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder319();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer382();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder327();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer13();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer48();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.writeZero((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length must be 0 or greater than 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer204();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer156();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer5.writeBytes(inputStream6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder276();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer274();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer361();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer405();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer222();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer302();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter7 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter7.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer88();
        dynamicChannelBuffer5.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder339();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder683();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder37();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder647();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder119();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(objectDecoder12);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer317();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer376();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder181();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer129();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter7 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter7.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel10 = serializedObjectSupporter7.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter7.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer273();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.readBytes((org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer13, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(embeddedChannel10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer36();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline12 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder298();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder506();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder7();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer121();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer281();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer412();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter0.deserializeObjectObjectDecoder353();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder15 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(objectDecoder14);
        org.junit.Assert.assertNotNull(objectDecoder15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer114();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder185();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer412();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer175();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer309();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder490();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer108();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer141();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder401();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline2 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline9();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDecoder1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer216();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer189();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder17();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder675();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder713();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer143();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder207();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder311();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer209();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer222();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer322();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer250();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer368();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer425();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer363();
        boolean boolean8 = bigEndianHeapChannelBuffer7.writable();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer19();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        long long6 = dynamicChannelBuffer4.getUnsignedInt((int) (short) 0);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 515L + "'", long6 == 515L);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer188();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder616();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder6.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer216();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer340();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder719();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder474();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer79();
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer4.writeBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 461");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer345();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer383();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer37();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer405();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer135();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer318();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer323();
        short short11 = bigEndianHeapChannelBuffer10.readShort();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer303();
        dynamicChannelBuffer3.markReaderIndex();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer206();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer119();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer309();
        dynamicChannelBuffer6.skipBytes((int) 'a');
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder296();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer110();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer96();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder761();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder9.channelDisconnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel6 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(embeddedChannel6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer318();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder683();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder805();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer338();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder550();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer416();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder514();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer327();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer31();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer90();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer329();
        org.junit.Assert.assertNotNull(objectDecoder1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer188();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder616();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer340();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bigEndianHeapChannelBuffer7.indexOf((int) '#', (int) (short) -1, channelBufferIndexFinder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder411();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer293();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer98();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer158();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer281();
        int int8 = dynamicChannelBuffer7.capacity();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32768 + "'", int8 == 32768);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer269();
        java.nio.ByteBuffer byteBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setBytes((int) '\000', byteBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer158();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder825();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder439();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder4.childChannelOpen(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer301();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer123();
        long long5 = bigEndianHeapChannelBuffer4.readLong();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 768890634415L + "'", long5 == 768890634415L);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer3.factory();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer51();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer91();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer11();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer36();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer406();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer230();
        dynamicChannelBuffer5.writeInt(0);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer134();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer116();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer273();
        dynamicChannelBuffer5.writeChar((int) (short) -1);
        short short8 = dynamicChannelBuffer5.readShort();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder498();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder675();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer48();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer233();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer402();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder462();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer56();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder126();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer54();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer318();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder584();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer20();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer418();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer412();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer292();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer59();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder452();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder385();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder548();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer81();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer427();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter2 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter2.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter2.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel5 = serializedObjectSupporter2.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter2.deserializeObjectBigEndianHeapChannelBuffer247();
        int int7 = bigEndianHeapChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer6);
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter9 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter9.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer185();
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer6.setBytes(18071, (org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(embeddedChannel5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder657();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer317();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder215();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder177();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder32();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer336();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer87();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer332();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter6 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter6.deserializeObjectObjectDecoder401();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer156();
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer4.getBytes((int) (short) -1, (org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer63();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer256();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder132();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bigEndianHeapChannelBuffer7.getMedium((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer207();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer98();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder248();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer188();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder616();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer364();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer313();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer222();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder785();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer332();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder270();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer336();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer128();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.channel.ChannelPipeline channelPipeline5 = embeddedChannel4.getPipeline();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(channelPipeline5);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer430();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer23();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer220();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer273();
        short short6 = dynamicChannelBuffer5.readUnsignedByte();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder752();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer87();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer313();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer225();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder431();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer204();
        byte byte6 = dynamicChannelBuffer4.getByte((int) (short) 1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder323();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder32();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder751();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer39();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder51();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder5.channelOpen(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer381();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder56();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder162();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer145();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer133();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder371();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer288();
        dynamicChannelBuffer4.setMedium(6866, (int) (byte) 1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder189();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder538();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder526();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer369();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer37();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer349();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer320();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer61();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer79();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer292();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer341();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder401();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer339();
        org.junit.Assert.assertNotNull(objectDecoder1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer66();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder185();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder849();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer355();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer77();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer233();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer412();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder407();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer296();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder801();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer235();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder548();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder753();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer130();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer416();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer120();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder853();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder588();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder351();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder548();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer79();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer292();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer57();
        dynamicChannelBuffer5.setMedium((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder405();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder411();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer250();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer299();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer332();
        byte byte6 = dynamicChannelBuffer5.readByte();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer320();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer137();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        int int5 = dynamicChannelBuffer4.readUnsignedShort();
        dynamicChannelBuffer4.discardReadBytes();
        int int9 = dynamicChannelBuffer4.bytesBefore((int) '\000', (byte) 100);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer158();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder482();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder542();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer119();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer164();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer412();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer244();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder16 = serializedObjectSupporter0.deserializeObjectObjectDecoder173();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer14);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer15);
        org.junit.Assert.assertNotNull(objectDecoder16);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder552();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer391();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer134();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer330();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer239();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer303();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder761();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel10 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder590();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(embeddedChannel10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(objectDecoder12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder181();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder383();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer420();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer249();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer10();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder2();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer71();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder514();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder300();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer157();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder302();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer246();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer365();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer114();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer303();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer12);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder276();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel8 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel8();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(embeddedChannel8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder638();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer325();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = bigEndianHeapChannelBuffer6.bytesBefore(channelBufferIndexFinder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer80();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer309();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder187();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder649();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer260();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer293();
        dynamicChannelBuffer10.resetReaderIndex();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer167();
        long long9 = bigEndianHeapChannelBuffer7.getUnsignedInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1852861302L + "'", long9 == 1852861302L);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer295();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder6();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer224();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer79();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer115();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer249();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer33();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder140();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder849();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer20();
        dynamicChannelBuffer6.writeMedium((int) '#');
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder763();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer88();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder18();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer68();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.readBytes(outputStream7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer142();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder486();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer235();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder185();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer426();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder752();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer79();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder429();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer158();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder482();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer276();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder308();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(objectDecoder10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer361();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer12);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder296();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder524();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder8.channelBound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer259();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter5 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter5.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter5.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter5.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel9 = serializedObjectSupporter5.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.channel.ChannelFactory channelFactory10 = embeddedChannel9.getFactory();
        int int11 = embeddedChannel4.compareTo((org.jboss.netty.channel.Channel) embeddedChannel9);
        org.jboss.netty.channel.ChannelPipeline channelPipeline12 = embeddedChannel4.getPipeline();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(embeddedChannel9);
        org.junit.Assert.assertNotNull(channelFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(channelPipeline12);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer302();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder801();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer351();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer275();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder641();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer434();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer387();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer113();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder486();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer271();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer265();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.getBytes(12549, outputStream7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer140();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer253();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer287();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder270();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder181();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder383();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer24();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder504();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(objectDecoder11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer230();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer13);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer82();
        int int5 = dynamicChannelBuffer2.bytesBefore((int) (short) 10, (byte) 10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer338();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer30();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer324();
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer7.writeChar((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 84");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer337();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer77();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer3();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder429();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder290();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(objectDecoder10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder150();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder683();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer158();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder482();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder542();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer85();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer257();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder480();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder506();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder187();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer52();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer162();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer9();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer318();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder791();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(objectDecoder12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder498();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer320();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder68();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer371();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer102();
        int int4 = bigEndianHeapChannelBuffer3.writableBytes();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer115();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer162();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer175();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder677();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder349();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer207();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder389();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer426();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        short short6 = bigEndianHeapChannelBuffer5.readShort();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer236();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder222();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer19();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder371();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline6 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline9();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer247();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer396();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder496();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder478();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder236();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer162();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer28();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder146();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer141();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder630();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer367();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer383();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder496();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer123();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer216();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer360();
        dynamicChannelBuffer4.setZero((int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder85();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder154();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer306();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer13);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder191();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer293();
        short short10 = dynamicChannelBuffer8.getShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 28014 + "'", short10 == (short) 28014);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer247();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer231();
        int int6 = bigEndianHeapChannelBuffer5.writableBytes();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder22();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer423();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder177();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer309();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder187();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder649();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder343();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer324();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer12);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel5 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel3();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer355();
        int int10 = dynamicChannelBuffer6.indexOf((int) (short) 28014, 12549, (byte) 1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(embeddedChannel5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27774 + "'", int10 == 27774);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder407();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder506();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder187();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer52();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer162();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter8 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter8.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter8.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter8.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder15 = serializedObjectSupporter8.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder16 = serializedObjectSupporter8.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer17 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder18 = serializedObjectSupporter8.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer19 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder20 = serializedObjectSupporter8.deserializeObjectObjectDecoder693();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer21 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer412();
        bigEndianHeapChannelBuffer6.getBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer21);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(objectDecoder14);
        org.junit.Assert.assertNotNull(objectDecoder15);
        org.junit.Assert.assertNotNull(objectDecoder16);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer17);
        org.junit.Assert.assertNotNull(objectDecoder18);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer19);
        org.junit.Assert.assertNotNull(objectDecoder20);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer21);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder552();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder5.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder357();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder367();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer160();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer324();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer420();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder506();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder187();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer159();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer262();
        org.jboss.netty.channel.DefaultChannelConfig defaultChannelConfig6 = serializedObjectSupporter0.deserializeObjectChannelConfig1();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(defaultChannelConfig6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer266();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer35();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter9 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter9.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel12 = serializedObjectSupporter9.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter9.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter9.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder15 = serializedObjectSupporter9.deserializeObjectObjectDecoder17();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer16 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer348();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.setBytes((int) (short) 28014, (org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer16, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(embeddedChannel12);
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
        org.junit.Assert.assertNotNull(objectDecoder15);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer16);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer188();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder616();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer340();
        bigEndianHeapChannelBuffer7.markWriterIndex();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder494();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder4.childChannelOpen(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer178();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer376();
        java.nio.ByteBuffer byteBuffer8 = dynamicChannelBuffer5.toByteBuffer((int) (short) 1, (int) '\000');
        dynamicChannelBuffer5.setLong((int) (byte) 100, (long) 5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        boolean boolean8 = bigEndianHeapChannelBuffer7.writable();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer135();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = bigEndianHeapChannelBuffer4.getBoolean(27774);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 27774");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer310();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer407();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer296();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer412();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter0.deserializeObjectObjectDecoder353();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer287();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(objectDecoder14);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer15);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer288();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer239();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder298();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer164();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder771();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder643();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer60();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer320();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer349();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline11 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer247();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder296();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder524();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder427();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer304();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer190();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer87();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder450();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer188();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder616();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer415();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer283();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }
}

