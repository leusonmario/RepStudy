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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        dynamicChannelBuffer4.setFloat((int) (byte) 10, 0.0f);
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter8 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter8.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter8.deserializeObjectDynamicChannelBuffer150();
        dynamicChannelBuffer4.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) (byte) 0, (int) 'a');
        byte[] byteArray19 = new byte[] { (byte) 116, (byte) 10, (byte) 1, (byte) 116 };
        dynamicChannelBuffer11.readBytes(byteArray19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and dynamicChannelBuffer10", Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer142();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder14();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer185();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer177();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer162();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder357();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer108();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer220();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer42();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder746();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer402();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer255();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer71();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer62();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer42();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer6 and bigEndianHeapChannelBuffer7", Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer7)) == -Math.signum(bigEndianHeapChannelBuffer7.compareTo(dynamicChannelBuffer6)));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer247();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer218();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer59();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder319();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer426();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer175();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and dynamicChannelBuffer6", Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer162();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer386();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder165();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer5 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer5)));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer252();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder28();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer5 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer5)));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder282();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer163();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer16();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer389();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer108();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder319();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder41();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder437();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer38();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and dynamicChannelBuffer8", Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder359();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer239();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer362();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer6 and dynamicChannelBuffer7", Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(dynamicChannelBuffer6)));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder548();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder84();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer360();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder750();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer148();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer338();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer7 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer7.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer7)));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer123();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer92();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder598();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer6();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer155();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer165();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer246();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer5 and dynamicChannelBuffer9", Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(bigEndianHeapChannelBuffer5)));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel9 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel10();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer101();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on embeddedChannel3 and embeddedChannel9", (embeddedChannel3.compareTo(embeddedChannel9) == 0) == embeddedChannel3.equals(embeddedChannel9));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer247();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder502();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer45();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel8 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder540();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on embeddedChannel3 and embeddedChannel8", (embeddedChannel3.compareTo(embeddedChannel8) == 0) == embeddedChannel3.equals(embeddedChannel8));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer231();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder72();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer149();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder66();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and dynamicChannelBuffer6", Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer415();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer195();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer307();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder584();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer116();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer5 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer5)));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer341();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer5 and dynamicChannelBuffer9", Math.signum(dynamicChannelBuffer5.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(dynamicChannelBuffer5)));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer239();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer37();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer6 and dynamicChannelBuffer7", Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(dynamicChannelBuffer6)));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer115();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer144();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer225();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder15 = serializedObjectSupporter0.deserializeObjectObjectDecoder101();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer14", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer14)) == -Math.signum(dynamicChannelBuffer14.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer240();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder369();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer5 and bigEndianHeapChannelBuffer7", Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer7)) == -Math.signum(bigEndianHeapChannelBuffer7.compareTo(dynamicChannelBuffer5)));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer236();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder234();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer110();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder205();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer5 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer5)));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer205();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder500();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer90();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer179();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer14", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer14)) == -Math.signum(dynamicChannelBuffer14.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder496();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer67();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder821();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and dynamicChannelBuffer6", Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer170();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter7 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter7.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter7.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter7.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer98();
        dynamicChannelBuffer13.ensureWritableBytes(0);
        java.nio.ByteBuffer byteBuffer18 = dynamicChannelBuffer13.toByteBuffer((int) ' ', 5);
        dynamicChannelBuffer5.setBytes(0, byteBuffer18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer11 and dynamicChannelBuffer13", Math.signum(bigEndianHeapChannelBuffer11.compareTo(dynamicChannelBuffer13)) == -Math.signum(dynamicChannelBuffer13.compareTo(bigEndianHeapChannelBuffer11)));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer360();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer151();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and dynamicChannelBuffer6", Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer416();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel7 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder745();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on embeddedChannel3 and embeddedChannel7", (embeddedChannel3.compareTo(embeddedChannel7) == 0) == embeddedChannel3.equals(embeddedChannel7));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer163();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder474();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer5 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer5)));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder371();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer288();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer361();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder641();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer434();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder723();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer234();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer392();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer5 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer5)));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder323();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder35();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer62();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder472();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer402();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer67();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer103();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer418();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer267();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer269();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer31();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer164();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer405();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder572();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer416();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer81();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer412();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder379();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer5 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer5)));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer65();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer329();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder425();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer199();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer317();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer5 and bigEndianHeapChannelBuffer8", Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer8)) == -Math.signum(bigEndianHeapChannelBuffer8.compareTo(dynamicChannelBuffer5)));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder423();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer275();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer316();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder474();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer55();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer185();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer177();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer308();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer4", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder568();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer141();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer21();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer290();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer7 and dynamicChannelBuffer9", Math.signum(dynamicChannelBuffer7.compareTo(dynamicChannelBuffer9)) == -Math.signum(dynamicChannelBuffer9.compareTo(dynamicChannelBuffer7)));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder327();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer13();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer254();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder407();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer17();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer7", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer7)) == -Math.signum(bigEndianHeapChannelBuffer7.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer320();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer196();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer222();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer26();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder506();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder7();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer193();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer238();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer348();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer1();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer5 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer5)));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer414();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer11", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer11)) == -Math.signum(dynamicChannelBuffer11.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer231();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder72();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer149();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder14();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and dynamicChannelBuffer6", Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder474();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer418();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder546();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer4", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer4)) == -Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer375();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer289();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder171();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer117();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder142();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer401();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer12", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer12)) == -Math.signum(dynamicChannelBuffer12.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder548();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder389();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer312();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder813();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer1 and dynamicChannelBuffer5", Math.signum(bigEndianHeapChannelBuffer1.compareTo(dynamicChannelBuffer5)) == -Math.signum(dynamicChannelBuffer5.compareTo(bigEndianHeapChannelBuffer1)));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer231();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer14", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer14)) == -Math.signum(dynamicChannelBuffer14.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer210();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer368();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder514();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer327();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer394();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and dynamicChannelBuffer6", Math.signum(dynamicChannelBuffer2.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer313();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer317();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer2 and bigEndianHeapChannelBuffer5", Math.signum(dynamicChannelBuffer2.compareTo(bigEndianHeapChannelBuffer5)) == -Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer2)));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder568();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer83();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer321();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer77();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer233();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder550();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer342();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer378();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer5 and dynamicChannelBuffer10", Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer10)) == -Math.signum(dynamicChannelBuffer10.compareTo(bigEndianHeapChannelBuffer5)));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder132();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer409();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer400();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer7", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer7)) == -Math.signum(bigEndianHeapChannelBuffer7.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer323();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer161();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer249();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer248();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and dynamicChannelBuffer7", Math.signum(dynamicChannelBuffer4.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer256();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer330();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer5 and dynamicChannelBuffer8", Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer8)) == -Math.signum(dynamicChannelBuffer8.compareTo(bigEndianHeapChannelBuffer5)));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder771();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder643();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer402();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer7", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer7)) == -Math.signum(bigEndianHeapChannelBuffer7.compareTo(dynamicChannelBuffer4)));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer320();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer3 and dynamicChannelBuffer14", Math.signum(bigEndianHeapChannelBuffer3.compareTo(dynamicChannelBuffer14)) == -Math.signum(dynamicChannelBuffer14.compareTo(bigEndianHeapChannelBuffer3)));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer348();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder444();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer5 and dynamicChannelBuffer7", Math.signum(bigEndianHeapChannelBuffer5.compareTo(dynamicChannelBuffer7)) == -Math.signum(dynamicChannelBuffer7.compareTo(bigEndianHeapChannelBuffer5)));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer323();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder731();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer4 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer4.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer4)));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer367();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer310();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder321();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on bigEndianHeapChannelBuffer2 and dynamicChannelBuffer6", Math.signum(bigEndianHeapChannelBuffer2.compareTo(dynamicChannelBuffer6)) == -Math.signum(dynamicChannelBuffer6.compareTo(bigEndianHeapChannelBuffer2)));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer129();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer300();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on dynamicChannelBuffer4 and bigEndianHeapChannelBuffer6", Math.signum(dynamicChannelBuffer4.compareTo(bigEndianHeapChannelBuffer6)) == -Math.signum(bigEndianHeapChannelBuffer6.compareTo(dynamicChannelBuffer4)));
    }
}

