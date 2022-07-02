import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer406();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder704();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder443();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer157();
        double double7 = bigEndianHeapChannelBuffer5.getDouble(103);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.155722442250002E219d + "'", double7 == 2.155722442250002E219d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer231();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder72();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer149();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder771();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder387();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder302();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer330();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer125();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder14();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        int int5 = dynamicChannelBuffer4.capacity();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.setByte((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32768 + "'", int5 == 32768);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer310();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer407();
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder22 = serializedObjectSupporter8.deserializeObjectObjectDecoder353();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer23 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer105();
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer7.readBytes((org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
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
        org.junit.Assert.assertNotNull(objectDecoder22);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer23);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder282();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer163();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder335();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer343();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer394();
        org.junit.Assert.assertNotNull(objectDecoder1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer51();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder325();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = bigEndianHeapChannelBuffer5.readSlice(10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder296();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder150();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer12();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer135();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder758();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder10.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer390();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer110();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer204();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer3.slice((int) ' ', 10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer21();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer39();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer50();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer49();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer262();
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder181();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder29();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder39();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer87();
        long long9 = bigEndianHeapChannelBuffer8.readUnsignedInt();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 232L + "'", long9 == 232L);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder381();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder805();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder85();
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder608();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder661();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer82();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer339();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder771();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder270();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer420();
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
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer385();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder298();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder518();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer250();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer178();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer115();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter12 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter12.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter12.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder15 = serializedObjectSupporter12.deserializeObjectObjectDecoder809();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder16 = serializedObjectSupporter12.deserializeObjectObjectDecoder66();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder17 = serializedObjectSupporter12.deserializeObjectObjectDecoder602();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer18 = serializedObjectSupporter12.deserializeObjectBigEndianHeapChannelBuffer223();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = serializedObjectSupporter12.deserializeObjectDynamicChannelBuffer18();
        dynamicChannelBuffer10.setBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(objectDecoder14);
        org.junit.Assert.assertNotNull(objectDecoder15);
        org.junit.Assert.assertNotNull(objectDecoder16);
        org.junit.Assert.assertNotNull(objectDecoder17);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer18);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer19);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer425();
        short short8 = dynamicChannelBuffer6.getShort(32974);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer331();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer289();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder377();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(objectDecoder11);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer354();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer43();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer355();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder750();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer182();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer382();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel6 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder288();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(embeddedChannel6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder659();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer2();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer401();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder801();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder576();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer338();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer175();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer375();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer124();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer99();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer172();
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer375();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder351();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer166();
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer233();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer24();
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder746();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer324();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter8 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter8.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter8.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter8.deserializeObjectBigEndianHeapChannelBuffer310();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        bigEndianHeapChannelBuffer14.readBytes(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer7.writeBytes(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 1, 45]");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer375();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer289();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer329();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder548();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer66();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer363();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder582();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer190();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer295();
        bigEndianHeapChannelBuffer9.setBoolean(1, false);
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder60();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer179();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer399();
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder357();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder367();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer167();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder743();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder66();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder470();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer189();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer389();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder743();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder395();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer108();
        dynamicChannelBuffer8.setFloat((int) '4', (float) (-1));
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer139();
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder638();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer71();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer337();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer67();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer52();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder647();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer147();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer6();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer287();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder679();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder292();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer407();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer7.setBytes(160, scatteringByteChannel9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder319();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer98();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer222();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer384();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder771();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder270();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder693();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder351();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer190();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder847();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer350();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder56();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer120();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder215();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder270();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer118();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder849();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder714();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder819();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer249();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder452();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer181();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder199();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder56();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder162();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer145();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer124();
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder641();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder704();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer256();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer110();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer330();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder207();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder480();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder608();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer212();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder748();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer396();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer160();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder181();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer325();
        dynamicChannelBuffer6.writeFloat((float) 35);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer95();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder401();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer156();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer330();
        org.junit.Assert.assertNotNull(objectDecoder1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder437();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer69();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder315();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer262();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder829();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer225();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder478();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder405();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer269();
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
        org.junit.Assert.assertNotNull(dynamicChannelBuffer13);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer401();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '\000');
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder341();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
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
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer14);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer247();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer208();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer423();
        char char10 = bigEndianHeapChannelBuffer8.getChar(0);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer364();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer37();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer350();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel8 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel3();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(embeddedChannel8);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.channel.ChannelFactory channelFactory5 = embeddedChannel4.getFactory();
        org.jboss.netty.channel.ChannelFuture channelFuture6 = embeddedChannel4.disconnect();
        org.jboss.netty.channel.ChannelPipeline channelPipeline7 = embeddedChannel4.getPipeline();
        int int8 = embeddedChannel4.getInterestOps();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(channelFactory5);
        org.junit.Assert.assertNotNull(channelFuture6);
        org.junit.Assert.assertNotNull(channelPipeline7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder228();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder763();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder747();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder552();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder268();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder142();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder746();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer246();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer90();
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        long long6 = bigEndianHeapChannelBuffer5.readLong();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1228452135194L + "'", long6 == 1228452135194L);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        short short6 = dynamicChannelBuffer4.getShort((int) ' ');
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 28513 + "'", short6 == (short) 28513);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer322();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(objectDecoder13);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder679();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder504();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder526();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer185();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        bigEndianHeapChannelBuffer2.setBytes(0, byteArray5);
        org.junit.Assert.assertNotNull(objectDecoder1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer152();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer207();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder282();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer310();
        int int9 = dynamicChannelBuffer8.capacity();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32768 + "'", int9 == 32768);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer224();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer178();
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
        org.junit.Assert.assertNotNull(dynamicChannelBuffer13);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer250();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer178();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer282();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline11 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline7();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer231();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer122();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder319();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer426();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder32();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder751();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder638();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder132();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer409();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer246();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder260();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer43();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder744();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer355();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer247();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer231();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder462();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder280();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer389();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.channel.Channel channel4 = embeddedChannel3.getParent();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter5 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter5.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter5.deserializeObjectBigEndianHeapChannelBuffer183();
        org.jboss.netty.channel.ChannelFuture channelFuture8 = embeddedChannel3.write((java.lang.Object) serializedObjectSupporter5);
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter9 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter9.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel12 = serializedObjectSupporter9.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter9.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer16 = serializedObjectSupporter9.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder17 = serializedObjectSupporter9.deserializeObjectObjectDecoder302();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = serializedObjectSupporter9.deserializeObjectDynamicChannelBuffer60();
        boolean boolean19 = embeddedChannel3.equals((java.lang.Object) dynamicChannelBuffer18);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNull(channel4);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(channelFuture8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(embeddedChannel12);
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer14);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer15);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer16);
        org.junit.Assert.assertNotNull(objectDecoder17);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer264();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder437();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer69();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder315();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder719();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder829();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer135();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer336();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer302();
        dynamicChannelBuffer5.writeDouble((double) 768890634415L);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer207();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer290();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer80();
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder506();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder187();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer52();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer366();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder819();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer118();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder43();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer41();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter7 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter7.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer316();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter7.deserializeObjectBigEndianHeapChannelBuffer393();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter7.deserializeObjectDynamicChannelBuffer268();
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, (int) 'a');
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer13);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder827();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder725();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder478();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer185();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer177();
        org.junit.Assert.assertNotNull(objectDecoder1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder606();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder369();
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder203();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer87();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer313();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder24();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder825();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder737();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer391();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder647();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer207();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder17();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder152();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer347();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder630();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer349();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder552();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer30();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer225();
        org.junit.Assert.assertNotNull(dynamicChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer76();
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
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer278();
        byte byte9 = dynamicChannelBuffer7.getByte((int) (byte) 116);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 98 + "'", byte9 == (byte) 98);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer394();
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder677();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder552();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer149();
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer6.toByteBuffers(100, 35);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(byteBufferArray9);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        dynamicChannelBuffer5.setLong(1, 1852925047L);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer5.setBytes((int) (byte) -1, inputStream10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer274();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder282();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer380();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder536();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer307();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer192();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer235();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer367();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder3();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer1();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer260();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder600();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder608();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer50();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder653();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer71();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder17();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder675();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder713();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer184();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer51();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer392();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder66();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer147();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder657();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder353();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer31();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder3();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer432();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder339();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer256();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer367();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder696();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer419();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder568();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer141();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer8.setBytes(35, scatteringByteChannel10, 0);
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
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder361();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer260();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer353();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder771();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder185();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder755();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder18();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer165();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder185();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer87();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder622();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder72();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder560();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer77();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder298();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer401();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder665();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer292();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder409();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer12);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        short short7 = bigEndianHeapChannelBuffer6.readUnsignedByte();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder702();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder819();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder743();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder395();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder7.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.jboss.netty.channel.ChannelPipeline channelPipeline10 = embeddedChannel9.getPipeline();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(embeddedChannel9);
        org.junit.Assert.assertNotNull(channelPipeline10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer260();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder847();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder777();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder831();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer16();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer389();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer123();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer325();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder737();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer211();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer237();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder460();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter0.deserializeObjectObjectDecoder701();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(objectDecoder14);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer190();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer5.setBytes((int) (byte) 100, scatteringByteChannel7, 427);
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
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder544();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder280();
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
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder552();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder268();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder695();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(160, 0, (int) (byte) 10, (int) '\000', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder220();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder18();
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer190();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder268();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer237();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer152();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectDecoder8.channelOpen(channelHandlerContext9, channelStateEvent10);
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder554();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder258();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder677();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder349();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer207();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder389();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder761();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer383();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder744();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer158();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer11();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer109();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer249();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer356();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer73();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer51();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer128();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer58();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder335();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer126();
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer145();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder345();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer10();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer67();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer52();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer289();
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer106();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer391();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer58();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder335();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer179();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer285();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer364();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer288();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer340();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder715();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer314();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder584();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder162();
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
        org.junit.Assert.assertNotNull(objectDecoder13);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder665();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder805();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer27();
        int int14 = bigEndianHeapChannelBuffer13.readUnsignedMedium();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer335();
        org.junit.Assert.assertNotNull(objectDecoder1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer337();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder602();
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder677();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder349();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer207();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer411();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer353();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer19();
        short short8 = dynamicChannelBuffer6.getUnsignedByte(35);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 121 + "'", short8 == (short) 121);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer409();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder425();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline8 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer404();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer173();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer293();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer10.bytesBefore(channelBufferIndexFinder11);
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
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer414();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder329();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer259();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer416();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder343();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer43();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer384();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder211();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder28();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer274();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer71();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder220();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder130();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer406();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder488();
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
        org.junit.Assert.assertNotNull(objectDecoder12);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer118();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer428();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer260();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder480();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder608();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer313();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder290();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer78();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer302();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer364();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer320();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer131();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer423();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer126();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer416();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer63();
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
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer152();
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
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder689();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer290();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder290();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer58();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer232();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer16 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer47();
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
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer14);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer15);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer16);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer247();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer231();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder691();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer427();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder439();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder482();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer353();
        boolean boolean8 = bigEndianHeapChannelBuffer6.getBoolean(103);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer123();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder369();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder10();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder150();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder6();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer307();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder278();
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer275();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer7();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer331();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer335();
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
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder30();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder746();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer246();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder628();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer137();
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
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter4 = objectDecoder3.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder793();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder54();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer214();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer68();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder177();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer164();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer137();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer189();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer271();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter4 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter4.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter4.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter4.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter4.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter4.deserializeObjectBigEndianHeapChannelBuffer148();
        int int10 = bigEndianHeapChannelBuffer9.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer2.getBytes((int) (short) 100, (org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder195();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer212();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder24();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder514();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer133();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder423();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer275();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer354();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder811();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer128();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder369();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder677();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer381();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer354();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder739();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer423();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder645();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer182();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder743();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder395();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer108();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter10 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter10.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter10.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter10.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter10.deserializeObjectDynamicChannelBuffer291();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder15 = serializedObjectSupporter10.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer16 = serializedObjectSupporter10.deserializeObjectBigEndianHeapChannelBuffer1();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.setBytes((int) (short) 28014, (org.jboss.netty.buffer.ChannelBuffer) bigEndianHeapChannelBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
        org.junit.Assert.assertNotNull(objectDecoder15);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer16);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder66();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer147();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer5();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
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
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder47();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer291();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer51();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder387();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer330();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder15 = serializedObjectSupporter0.deserializeObjectObjectDecoder138();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder16 = serializedObjectSupporter0.deserializeObjectObjectDecoder56();
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
        org.junit.Assert.assertNotNull(objectDecoder15);
        org.junit.Assert.assertNotNull(objectDecoder16);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer54();
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
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder520();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder419();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder584();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer359();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer77();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer233();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer358();
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer122();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder765();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder361();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel11 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.channel.ChannelPipeline channelPipeline12 = embeddedChannel11.getPipeline();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(embeddedChannel11);
        org.junit.Assert.assertNotNull(channelPipeline12);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer360();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder343();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder171();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer327();
        int int8 = dynamicChannelBuffer7.capacity();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65536 + "'", int8 == 65536);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder290();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer374();
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer312();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer171();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter10 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter10.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter10.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel13 = serializedObjectSupporter10.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder14 = serializedObjectSupporter10.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter10.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer16 = serializedObjectSupporter10.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer17 = serializedObjectSupporter10.deserializeObjectBigEndianHeapChannelBuffer58();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = serializedObjectSupporter10.deserializeObjectDynamicChannelBuffer6();
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18, (int) (short) 0, (int) (short) 121);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(embeddedChannel13);
        org.junit.Assert.assertNotNull(objectDecoder14);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer15);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer16);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer17);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer18);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer237();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer8.factory();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer225();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder632();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer192();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer240();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder675();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer381();
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
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer330();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer194();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder132();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder268();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer251();
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder735();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer338();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder616();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder401();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer90();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder444();
        org.junit.Assert.assertNotNull(objectDecoder1);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 98);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder618();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder121();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer135();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer72();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder66();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder470();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer189();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder843();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer199();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer136();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder743();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer129();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer250();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer178();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer282();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder630();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(objectDecoder11);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer170();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer74();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder158();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder173();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder248();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer85();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder165();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer193();
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
        org.junit.Assert.assertNotNull(dynamicChannelBuffer13);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer67();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer52();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer17();
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer378();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer228();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer83();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer295();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder783();
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
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer81();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder558();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder353();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer284();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder17();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder8();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer37();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder32();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder751();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer11();
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
        org.junit.Assert.assertNotNull(byteOrder10);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder99();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder464();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer140();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer204();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder260();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline9 = serializedObjectSupporter0.deserializeObjectDefaultChannelPipeline3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext cannot be cast to org.jboss.netty.channel.DefaultChannelPipeline");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder413();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer309();
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer118();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder634();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder52();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder592();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder103();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer279();
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
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder669();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer382();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer273();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer236();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder302();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder641();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer378();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer67();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder319();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer372();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer316();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder502();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer147();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder300();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder175();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel4 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel5();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer257();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder355();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedChannel4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder594();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder167();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer35();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder699();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer162();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer395();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder232();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer294();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer221();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer309();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer22();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer151();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter16 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer17 = serializedObjectSupporter16.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder18 = serializedObjectSupporter16.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder19 = serializedObjectSupporter16.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer20 = serializedObjectSupporter16.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer21 = serializedObjectSupporter16.deserializeObjectBigEndianHeapChannelBuffer263();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer22 = serializedObjectSupporter16.deserializeObjectBigEndianHeapChannelBuffer310();
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        bigEndianHeapChannelBuffer22.readBytes(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.getBytes((int) '4', byteArray27, 6866, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer17);
        org.junit.Assert.assertNotNull(objectDecoder18);
        org.junit.Assert.assertNotNull(objectDecoder19);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer20);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer21);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 1, 45]");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer354();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder811();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer353();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder752();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder421();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder19();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer145();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer194();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder548();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer185();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter5 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter5.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter5.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter5.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter5.deserializeObjectObjectDecoder570();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer10 = serializedObjectSupporter5.deserializeObjectBigEndianHeapChannelBuffer230();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter5.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter5.deserializeObjectObjectDecoder191();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter5.deserializeObjectBigEndianHeapChannelBuffer309();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter5.deserializeObjectDynamicChannelBuffer129();
        dynamicChannelBuffer3.getBytes(1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer10);
        org.junit.Assert.assertNotNull(objectDecoder11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer115();
        // The following exception was thrown during execution in test generation
        try {
            bigEndianHeapChannelBuffer5.setFloat(7042425, (float) 32974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7042425");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.handler.codec.embedder.EmbeddedSocketAddress embeddedSocketAddress4 = serializedObjectSupporter0.deserializeObjectSocketAddress1();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder833();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer241();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder761();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(embeddedSocketAddress4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder417();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer14 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer8();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer15 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer344();
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
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer14);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer15);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder752();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer135();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer12();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder136();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer262();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer38();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer354();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder811();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer128();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder183();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer94();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer207();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder282();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder472();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer420();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder494();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer288();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer118();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder308();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder671();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer27();
        dynamicChannelBuffer7.writeShort((int) ' ');
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer7);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder124();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder327();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder484();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder762();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder156();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder290();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer53();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder570();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder751();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder11 = serializedObjectSupporter0.deserializeObjectObjectDecoder51();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(objectDecoder11);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer13 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer70();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer13);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer370();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder622();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer340();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer6);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder13 = serializedObjectSupporter0.deserializeObjectObjectDecoder341();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer79();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer14.factory();
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
        org.junit.Assert.assertNotNull(objectDecoder13);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer14);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder476();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer149();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder12 = serializedObjectSupporter0.deserializeObjectObjectDecoder201();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = serializedObjectSupporter0.deserializeObjectLengthFieldBasedFrameDecoder9();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
        org.junit.Assert.assertNotNull(objectDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer3 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer118();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder13();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder43();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder764();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder853();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder365();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder387();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder683();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer279();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer418();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer154();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder556();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer12 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer124();
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer294();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder578();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder361();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer212();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(objectDecoder9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer125();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder274();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer153();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer112();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder272();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer331();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder308();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer27();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer11);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder20();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder76();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer288();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer340();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder169();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(objectDecoder6);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer201();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer34();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer148();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer46();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer171();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder296();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(objectDecoder10);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer26();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer96();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder302();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder8 = serializedObjectSupporter0.deserializeObjectObjectDecoder425();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer35();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(objectDecoder8);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer9);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer250();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder9 = serializedObjectSupporter0.deserializeObjectObjectDecoder801();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(objectDecoder9);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer403();
        int int15 = dynamicChannelBuffer11.indexOf(32974, (int) ' ', (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32587 + "'", int15 == 32587);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.embedder.EmbeddedChannel embeddedChannel3 = serializedObjectSupporter0.deserializeObjectEmbeddedChannel4();
        org.jboss.netty.channel.Channel channel4 = embeddedChannel3.getParent();
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter5 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter5.deserializeObjectObjectDecoder530();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter5.deserializeObjectBigEndianHeapChannelBuffer183();
        org.jboss.netty.channel.ChannelFuture channelFuture8 = embeddedChannel3.write((java.lang.Object) serializedObjectSupporter5);
        boolean boolean9 = embeddedChannel3.isOpen();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(embeddedChannel3);
        org.junit.Assert.assertNull(channel4);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(channelFuture8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder795();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer377();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder610();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer29();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer332();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder23();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer4 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer180();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer5 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer139();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer6 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer397();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer7 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer168();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer8 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer250();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer9 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer178();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer115();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer10.duplicate();
        java.nio.channels.GatheringByteChannel gatheringByteChannel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer10.getBytes(103, gatheringByteChannel13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer4);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer5);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer6);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer7);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer8);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer9);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer10);
        org.junit.Assert.assertNotNull(channelBuffer11);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder1 = serializedObjectSupporter0.deserializeObjectObjectDecoder220();
        org.junit.Assert.assertNotNull(objectDecoder1);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer334();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder117();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder2 = serializedObjectSupporter0.deserializeObjectObjectDecoder25();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder809();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder518();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder12();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(objectDecoder2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder10 = serializedObjectSupporter0.deserializeObjectObjectDecoder177();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer11 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer224();
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
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer11);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jboss.netty.handler.codec.frame.SerializedObjectSupporter serializedObjectSupporter0 = new org.jboss.netty.handler.codec.frame.SerializedObjectSupporter();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer1 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer9();
        org.jboss.netty.buffer.BigEndianHeapChannelBuffer bigEndianHeapChannelBuffer2 = serializedObjectSupporter0.deserializeObjectBigEndianHeapChannelBuffer269();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder3 = serializedObjectSupporter0.deserializeObjectObjectDecoder347();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder4 = serializedObjectSupporter0.deserializeObjectObjectDecoder339();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder5 = serializedObjectSupporter0.deserializeObjectObjectDecoder683();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder6 = serializedObjectSupporter0.deserializeObjectObjectDecoder27();
        org.jboss.netty.handler.codec.serialization.ObjectDecoder objectDecoder7 = serializedObjectSupporter0.deserializeObjectObjectDecoder797();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = serializedObjectSupporter0.deserializeObjectDynamicChannelBuffer241();
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer1);
        org.junit.Assert.assertNotNull(bigEndianHeapChannelBuffer2);
        org.junit.Assert.assertNotNull(objectDecoder3);
        org.junit.Assert.assertNotNull(objectDecoder4);
        org.junit.Assert.assertNotNull(objectDecoder5);
        org.junit.Assert.assertNotNull(objectDecoder6);
        org.junit.Assert.assertNotNull(objectDecoder7);
        org.junit.Assert.assertNotNull(dynamicChannelBuffer8);
    }
}

