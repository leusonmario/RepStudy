import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer228();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer6.copy();
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer366();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer204();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer247();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter0.deserializeObjectObjectDecoder286();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder387();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer13();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer265();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer107();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer402();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer193();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder849();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer280();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer357();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder246();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer17();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer140();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder805();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder222();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer342();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer24();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder173();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder452();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer212();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer65();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer17();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder144();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer43();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer231();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder260();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer279();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer286();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter4 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter4.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel6 = serializedObjectSupporter4.deserializeObjectEmbeddedChannel4();
        java.lang.String str7 = embeddedChannel6.toString();
        org.jboss.netty.channel.ChannelFactory channelFactory8 = embeddedChannel6.getFactory();
        java.net.SocketAddress socketAddress10 = null;
        org.jboss.netty.channel.ChannelFuture channelFuture11 = embeddedChannel6.write((java.lang.Object) (byte) -1, socketAddress10);
        boolean boolean12 = embeddedChannel6.isOpen();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter13 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter13.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter13.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder16 = serializedObjectSupporter13.deserializeObjectObjectDecoder37();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer17 = serializedObjectSupporter13.deserializeObjectBigEndianHeapChannelBuffer286();
        org.jboss.netty.channel.ChannelFuture channelFuture18 = embeddedChannel6.write((java.lang.Object) bigEndianHeapChannelBuffer17);
        int int19 = embeddedChannel3.compareTo((org.jboss.netty.channel.Channel) embeddedChannel6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer145();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer70();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder387();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder79();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer359();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer149();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer64();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer258();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer59();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer327();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer260();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer277();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder28();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder829();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer62();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer235();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer204();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer420();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter0.deserializeObjectObjectDecoder661();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer73();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer195();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder626();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer345();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer119();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer167();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer348();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer12();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder203();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer45();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer70();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer19();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel6 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel3();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer258();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer408();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder478();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer237();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder705();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer12();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer391();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder478();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer425();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder714();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder207();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder290();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer127();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer166();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer298();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder134();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel7 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder282();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer110();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder805();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer389();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer298();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer408();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer145();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder39();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer59();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer306();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder256();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer45();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder199();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder359();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder753();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer39();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer267();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer351();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer170();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder746();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer397();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer117();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer383();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer267();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer39();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer198();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder431();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer368();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer8();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer80();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer124();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer305();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer382();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder230();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer164();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer140();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder805();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder222();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer342();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer78();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer112();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer343();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
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
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer246();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dynamicChannelBuffer12.writeZero((int) '\u7371');
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder556();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer360();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder765();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer227();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder679();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder148();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer82();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer295();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder701();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer363();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer262();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer191();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder700();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer267();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer33();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder657();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer141();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer226();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer217();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer96();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer53();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer280();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder311();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer270();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer406();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder367();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder548();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer120();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer121();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer21();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer7();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder701();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer363();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer21();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer50();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer33();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer359();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder162();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer313();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder480();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder639();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer100();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder572();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer228();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer10();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder16();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer295();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer215();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter0.deserializeObjectObjectDecoder496();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer183();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder187();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer193();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer259();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer281();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder526();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder827();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder33();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder626();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer103();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer336();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer32();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer72();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer262();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder572();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder526();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer420();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder667();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer3)) == -Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer348();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer176();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer409();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer241();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer2", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer404();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer204();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer364();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer11();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder113();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer138();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder744();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer68();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder789();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer348();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder526();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer421();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer65();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer5.copy(3847, 1818523506);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer430();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer268();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer72();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder803();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder260();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer135();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer52();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder308();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder185();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer208();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer254();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder835();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer52();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer176();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer417();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder22();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and bigEndianHeapChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer3)) == -Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder173();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer109();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer120();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer137();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer342();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder526();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder827();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer251();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer78();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder311();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer64();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer328();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer60();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder466();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer164();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer76();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer385();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer168();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
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
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer134();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer425();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder478();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder353();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer396();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer238();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder532();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer353();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer425();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer72();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer373();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer333();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder375();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder427();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer256();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer180();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer8();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder697();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder37();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer320();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer382();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter0.deserializeObjectObjectDecoder805();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder302();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer320();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder173();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder296();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer369();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer132();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder753();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer13();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder4 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder3();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer334();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer283();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer187();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder219();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer140();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder805();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder238();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder70();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer375();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder41();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder626();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder733();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer253();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder811();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer313();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer43();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder765();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer227();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder698();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer249();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer352();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer108();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder474();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer365();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder827();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer281();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder3();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder673();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder582();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder446();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder763();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer190();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer235();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer193();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer214();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer420();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer228();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder502();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer378();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer271();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder317();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer70();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer302();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer223();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer204();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer420();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer272();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer305();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder574();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder317();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder3();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder220();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder532();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer106();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder709();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer14();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder819();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer70();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer146();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer265();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer60();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer62();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer433();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer149();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer292();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder205();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder604();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer265();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer344();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer20();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer224();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer41();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer70();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer151();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder207();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer200();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer396();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer324();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer261();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder290();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer127();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer138();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer414();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer63();
        double double6 = dynamicChannelBuffer5.readDouble();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on dynamicChannelBuffer5, bigEndianHeapChannelBuffer3, and bigEndianHeapChannelBuffer2", !(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer3) > 0 && bigEndianHeapChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2) > 0) || dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer2) > 0);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer192();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer259();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer228();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer61();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter12 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter12.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter12.deserializeObjectObjectDecoder578();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = serializedObjectSupporter12.deserializeObjectDynamicChannelBuffer184();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        dynamicChannelBuffer15.readBytes(byteArray21);
        dynamicChannelBuffer10.getBytes((int) (byte) 10, byteArray21, 1, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer134();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer28();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder761();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer286();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer122();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer298();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer381();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder367();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder548();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer120();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer424();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder584();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer378();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder841();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer359();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer2", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer2)) == -Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer108();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer41();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder300();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer183();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer408();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder723();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer250();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer352();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer427();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder512();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer7();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer411();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer265();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer380();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer311();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer318();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder33();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer38();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder3();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer253();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer308();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder626();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer280();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer377();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer68();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer338();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder562();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder849();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer280();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer283();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer385();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer157();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder526();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer163();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer57();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder280();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder498();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer402();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer8();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer161();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer342();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder522();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer222();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder325();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer88();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder199();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer137();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer326();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer352();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer181();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder673();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer11();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder300();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder140();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer185();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder339();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer177();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder663();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer348();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer373();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder753();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer358();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer39();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder813();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer46();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder113();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer131();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer120();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder270();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer256();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer224();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer124();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer266();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer75();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder456();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer85();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer97();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer267();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer39();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer281();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder756();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer332();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer97();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer258();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer192();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder612();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer382();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer242();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder317();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder3();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer131();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder600();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder753();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder448();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer381();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder741();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer280();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer106();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder195();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder512();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer210();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder387();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer190();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer28();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer123();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer138();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder128();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer297();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer127();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder341();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder308();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer292();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer399();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder427();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer389();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer176();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer6", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder162();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder756();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer401();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder853();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder117();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer12();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer324();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer268();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer41();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer246();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder315();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer4", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer4)) == -Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer100();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder21();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer277();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer220();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer1.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer100();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer203();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder207();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer200();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder81();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer3();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter0.deserializeObjectObjectDecoder14();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer248();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder260();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer190();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder2();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder626();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer345();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer290();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer72();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder779();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer304();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer32();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder3();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer425();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder532();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer353();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder84();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer163();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer181();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer96();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer53();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder462();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer143();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer267();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer153();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder756();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer209();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder478();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder353();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer383();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer270();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder311();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer64();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer328();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder761();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer105();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder466();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer353();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer407();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer322();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer82();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer191();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder29();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer390();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer248();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer115();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder620();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder308();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder185();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer423();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer306();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder647();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer65();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer272();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer6", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer341();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer301();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer3", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder727();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer288();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer89();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer134();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer141();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer104();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer270();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer1 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer1.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer1)));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder466();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder472();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer175();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer8.copy();
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder512();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer84();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress5 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer84();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter0.deserializeObjectObjectDecoder91();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder431();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer368();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer216();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer19();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer316();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer104();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder339();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder719();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer54();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer86();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer279();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer212();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer282();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer159();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer282();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer137();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer17();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder242();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder173();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer317();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder195();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder815();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder311();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer270();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder337();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder673();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer11();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder300();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder140();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder572();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer145();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer7();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder435();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder823();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer161();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder207();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer200();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder81();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer3();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer84();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder837();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder492();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder87();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder542();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer198();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer396();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder1 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer96();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer65();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer3", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer3)) == -Math.signum(dynamicChannelBuffer3.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder260();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder34();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder236();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer15();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder590();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer293();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder393();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder765();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer227();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder698();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder709();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder258();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer89();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder657();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer1)));
    }
}

