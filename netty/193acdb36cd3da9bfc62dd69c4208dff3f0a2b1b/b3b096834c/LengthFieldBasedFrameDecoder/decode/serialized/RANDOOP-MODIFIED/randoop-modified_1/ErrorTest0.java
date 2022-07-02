import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer173();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer152();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer146();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer146();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer146();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder132();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer283();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer239();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer20();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer408();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer146();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer53();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer283();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer118();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer334();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer74();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer315();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer409();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer283();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer270();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder704();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer351();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer74();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer361();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer101();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer287();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder193();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder134();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer224();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder433();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer163();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer93();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer137();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer399();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer142();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer253();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder488();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer8();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder608();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer3)) == -Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer93();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer74();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer157();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer104();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer301();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer74();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer385();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer116();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder657();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer8();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer118();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer152();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer33();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer342();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer137();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder171();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer277();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer163();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder4();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer142();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer286();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer368();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer283();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer185();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer362();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer74();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer5.copy();
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer8();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder673();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer254();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer271();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer281();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer253();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer65();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer93();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer78();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer41();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer423();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer100();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer420();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer152();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer11();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder375();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer4();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer329();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer157();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder383();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer142();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder630();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer142();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder657();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer75();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer185();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder767();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer212();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder598();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer3)) == -Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer34();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder769();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer359();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder721();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer337();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer91();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer139();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer102();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer417();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder756();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer244();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer107();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer303();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer376();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder763();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer286();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer21();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter7 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter7.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter7.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter7.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer221();
        bigEndianHeapChannelBuffer5.setBytes((int) '#', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder636();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer146();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer250();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer285();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder524();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer235();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter4 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter4.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter4.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel7 = serializedObjectSupporter4.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter4.deserializeObjectObjectDecoder657();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter4.deserializeObjectDynamicChannelBuffer141();
        lengthFieldBasedFrameDecoder3.serializedObjectSupporter = serializedObjectSupporter4;
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder756();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer211();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer24();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder748();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer93();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer104();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer11();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer298();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer111();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer80();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer65();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer130();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer411();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer35();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer58();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder700();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer242();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer271();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer34();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder375();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer252();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder673();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer412();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer200();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer50();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer280();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder17();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer3)) == -Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer152();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer387();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer315();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer179();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer98();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer33();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer107();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer132();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer420();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer287();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer412();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder829();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer382();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder7();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer179();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer98();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder829();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer211();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer227();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer44();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer286();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer227();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer185();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer351();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder252();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer289();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer423();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer385();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer36();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer11();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer207();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer150();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer167();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer286();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer332();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder68();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer80();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer21();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder474();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer31();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer100();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer260();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer3.copy(0, (int) '#');
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder280();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer374();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer238();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer185();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder488();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder626();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder733();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer316();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer193();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder164();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer186();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer152();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder695();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer309();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer65();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer156();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder506();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer350();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer231();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder164();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder657();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer141();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer110();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer104();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer175();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer138();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer189();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer29();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder395();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer139();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder357();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer228();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer301();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer371();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer142();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder431();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer342();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder697();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer252();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer48();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer352();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer368();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer148();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer203();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer392();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder220();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder592();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder401();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder474();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer114();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer396();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder673();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer296();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer357();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer64();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer277();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer181();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer6.copy();
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer352();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder387();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer191();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder4 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer350();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer207();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer368();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer163();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer402();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer335();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer62();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer415();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder18();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer433();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer118();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder4 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder4();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer55();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer169();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer114();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        int int6 = dynamicChannelBuffer5.readUnsignedMedium();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on dynamicChannelBuffer5, bigEndianHeapChannelBuffer3, and bigEndianHeapChannelBuffer2", !(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer3) > 0 && bigEndianHeapChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2) > 0) || dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer2) > 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer330();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder502();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer33();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer412();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer23();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer100();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer371();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder234();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer65();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer343();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer50();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer292();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder673();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer243();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder331();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder542();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer247();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder480();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer65();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer130();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer152();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer217();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer433();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder290();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer421();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer360();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer116();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer77();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer400();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer382();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer15();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder91();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer93();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer220();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer157();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer63();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer259();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder6();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder2();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer148();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer331();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder431();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer342();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder697();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer252();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer217();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer427();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer131();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer135();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer90();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer222();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer216();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder421();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer318();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer60();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer80();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer173();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer91();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer416();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder363();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder375();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer36();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder466();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer41();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer336();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer399();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder675();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder756();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer268();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer7();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer139();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer22();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder278();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer212();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer72();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer3)) == -Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder466();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer364();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer359();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder266();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer148();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder636();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder68();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer80();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder743();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer380();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder532();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer353();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer376();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer156();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer336();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer385();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer175();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer426();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder586();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer127();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer71();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder280();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer374();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer134();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder616();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer220();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer56();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer376();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer249();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer350();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer68();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer91();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer416();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer362();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder56();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder85();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder164();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder821();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer352();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer325();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer46();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder785();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer222();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer227();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel2 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer94();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer132();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer289();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder311();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder606();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer3)) == -Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder246();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder474();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer31();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer302();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer45();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer70();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer188();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer427();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder284();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer412();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer321();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder454();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer433();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer288();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer195();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer51();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer421();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer35();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer367();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer40();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer178();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer31();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer412();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer58();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder647();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder526();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder827();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer251();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter9 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter9.deserializeObjectObjectDecoder572();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = serializedObjectSupporter9.deserializeObjectDynamicChannelBuffer358();
        dynamicChannelBuffer8.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (int) (byte) 1, 515);
        int int20 = dynamicChannelBuffer15.bytesBefore((byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer179();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer98();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder741();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder608();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder187();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer329();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer70();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer412();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder524();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer248();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer179();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder373();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer167();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer363();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder43();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder452();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder758();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer62();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel6 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer204();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer148();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder542();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer247();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder308();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer57();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder164();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer232();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer200();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer50();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer410();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer150();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer135();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder4 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer239();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer413();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer335();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel10 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder626();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder733();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer316();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer340();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer235();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder657();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder510();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer385();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder431();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer342();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder697();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer252();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer113();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer204();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder556();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder552();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder349();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer227();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer414();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer364();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder849();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer111();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer335();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer142();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder68();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer80();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer58();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer220();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder763();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder697();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder373();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer109();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer314();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer277();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer250();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder41();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder542();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer232();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer403();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder302();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer315();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer94();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer421();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer252();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder737();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer387();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer48();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer373();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer295();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer43();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer391();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer222();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder723();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer331();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer94();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer319();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer185();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder761();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer44();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer63();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder317();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer70();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer150();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer277();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer331();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer94();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer225();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder134();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder431();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer342();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder697();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer252();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder775();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer351();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder550();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer310();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer127();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder789();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer139();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder4();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer381();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer257();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder280();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder498();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer402();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer311();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer74();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer131();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer35();
        dynamicChannelBuffer5.ensureWritableBytes((int) '#');
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter8 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter8.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer374();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = serializedObjectSupporter8.deserializeObjectDynamicChannelBuffer107();
        dynamicChannelBuffer5.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, 7389, 515);
        dynamicChannelBuffer16.writeChar(515);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder351();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer190();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer51();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder351();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder197();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer57();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer182();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer214();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer359();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder425();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer64();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer283();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer298();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer179();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer98();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer353();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer41();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder68();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer80();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder661();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder829();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer62();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer187();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer310();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder439();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer211();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer55();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer156();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer225();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer399();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer243();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer145();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer367();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder302();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer315();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder502();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer368();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder805();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer197();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder504();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer135();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder785();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder317();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer70();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer150();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder224();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer185();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer76();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer230();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer125();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer222();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer180();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer137();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer3.copy(4, 32768);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer203();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder632();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder701();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer17();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer161();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer332();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer228();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer217();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer391();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer6();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer74();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer220();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer194();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer283();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer183();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer182();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer352();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer31();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder685();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder542();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer408();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer331();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer94();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder64();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer283();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder421();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer258();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer421();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer155();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer54();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer11();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer346();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder280();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer338();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer130();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer350();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer178();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder431();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer342();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer408();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer212();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder756();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder385();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer213();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer359();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder425();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer64();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer71();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer190();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer293();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer419();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder737();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer278();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder626();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder733();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer224();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer58();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer324();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.channel.ChannelFuture channelFuture5 = embeddedChannel3.write((java.lang.Object) 0);
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter6 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter6.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter6.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter6.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer16();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter6.deserializeObjectBigEndianHeapChannelBuffer404();
        boolean boolean14 = embeddedChannel3.equals((java.lang.Object) serializedObjectSupporter6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer7", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer7)) == -Math.signum(bigEndianHeapChannelBuffer7.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer65();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer130();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer168();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder29();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer421();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer155();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer54();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder2();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer111();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer153();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer363();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder6();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer385();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder576();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer359();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder425();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer159();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder51();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer3)) == -Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer227();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder799();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder308();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer72();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder97();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder351();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder197();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer222();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder423();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder542();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer18();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer421();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer266();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer387();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder765();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer227();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder698();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer343();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer13();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer270();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer288();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer89();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer134();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer388();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer191();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer320();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder421();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer346();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer330();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer232();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer200();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer21();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer281();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder564();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer142();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder209();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer386();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder26();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer105();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer363();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer349();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer305();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder482();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer78();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer368();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer138();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer288();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer195();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer3();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder655();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer250();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer114();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder379();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder626();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder733();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer224();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer58();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer256();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer146();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder4();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder270();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer178();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer199();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer227();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer354();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer179();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder373();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer167();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel10 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer227();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer259();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer111();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer310();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer150();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer260();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer331();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder93();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer421();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer266();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder572();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder431();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer342();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder697();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer252();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer186();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder113();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer324();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer337();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder140();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder639();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer232();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder602();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer82();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder474();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder52();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer200();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer50();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer30();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder756();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer15();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel2 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer35();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer271();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer125();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder746();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder753();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer16();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer380();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer321();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer103();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder647();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer65();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer301();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer6", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder462();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and bigEndianHeapChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer3)) == -Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer188();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer268();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer291();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer416();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder540();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder568();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer12();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer230();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer243();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer145();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer116();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer12();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder612();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder162();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer317();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer418();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer376();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer325();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer220();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder512();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer210();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer418();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer91();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer416();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer380();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder532();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer353();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer212();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder512();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer210();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer427();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer211();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer134();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder849();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer267();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer182();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer336();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer319();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel6 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel3();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder34();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder466();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer287();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer47();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer431();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder518();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer150();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer313();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer55();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer169();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer349();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer117();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer128();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer331();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder542();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer20();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer310();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder649();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer91();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer172();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder351();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer150();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder6();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer431();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer226();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel6 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel3();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer276();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder437();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer111();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer151();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer2)) == -Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer211();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer87();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }
}

