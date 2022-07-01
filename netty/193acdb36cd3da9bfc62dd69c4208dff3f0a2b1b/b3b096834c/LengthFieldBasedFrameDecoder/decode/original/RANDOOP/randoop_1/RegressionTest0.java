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
        int int0 = org.jboss.netty.channel.Channel.OP_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.copy((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.copy((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = dynamicChannelBuffer1.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 0, outputStream5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.setBytes((int) (short) 10, inputStream4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 100, outputStream3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = dynamicChannelBuffer1.getFloat((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.bytesBefore(5, (int) (short) -1, channelBufferIndexFinder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.readBytes((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray7 = dynamicChannelBuffer6.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray7, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((int) (byte) -1, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes((-1), inputStream7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean((int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((int) (short) 100, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        boolean boolean3 = dynamicChannelBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            char char5 = dynamicChannelBuffer1.getChar((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        boolean boolean3 = dynamicChannelBuffer1.writable();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy(100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes((-1), scatteringByteChannel7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        short short6 = dynamicChannelBuffer1.readShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int0 = org.jboss.netty.channel.Channel.OP_WRITE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.bytesBefore(10, channelBufferIndexFinder3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (byte) 100, (int) (byte) 10, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setByte((int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) '4', (int) (byte) -1, 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        short short6 = dynamicChannelBuffer1.readShort();
        // The following exception was thrown during execution in test generation
        try {
            short short8 = dynamicChannelBuffer1.getShort((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.skipBytes(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        java.lang.Class<?> wildcardClass4 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer5.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray10 = dynamicChannelBuffer9.array();
        dynamicChannelBuffer9.setIndex(10, (int) (short) 100);
        java.lang.String str14 = dynamicChannelBuffer9.toString();
        dynamicChannelBuffer5.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        dynamicChannelBuffer5.writeLong((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5, (int) (byte) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str14, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = org.jboss.netty.channel.Channel.OP_READ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) 1, 0, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray6, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        short short6 = dynamicChannelBuffer1.readShort();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 0, outputStream8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.slice(4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = dynamicChannelBuffer13.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int4 = dynamicChannelBuffer3.writableBytes();
        dynamicChannelBuffer3.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer3.factory();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) '#', channelBufferFactory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray20 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer19.setIndex(10, (int) (short) 100);
        byte[] byteArray24 = new byte[] {};
        dynamicChannelBuffer19.readBytes(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer13.writeBytes(byteArray24, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer6.toString((int) (byte) 10, 0, charset20);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dynamicChannelBuffer6.bytesBefore(channelBufferIndexFinder22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer6.toString((int) (byte) 10, 0, charset20);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer6.indexOf((int) (byte) 10, 2, channelBufferIndexFinder24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '#', byteArray11, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100, -1]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.bytesBefore((int) 'a', 1, (byte) 1);
        boolean boolean9 = dynamicChannelBuffer1.isDirect();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(5, outputStream7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray5 = dynamicChannelBuffer4.array();
        dynamicChannelBuffer4.resetWriterIndex();
        dynamicChannelBuffer4.resetReaderIndex();
        dynamicChannelBuffer4.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray12 = dynamicChannelBuffer11.array();
        boolean boolean13 = dynamicChannelBuffer11.writable();
        int int14 = dynamicChannelBuffer4.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) (byte) 0, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer20.clear();
        dynamicChannelBuffer20.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int26 = dynamicChannelBuffer25.writableBytes();
        boolean boolean27 = dynamicChannelBuffer25.isDirect();
        dynamicChannelBuffer20.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer32.writeInt(10);
        int int35 = dynamicChannelBuffer32.readerIndex();
        dynamicChannelBuffer25.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.getBytes((int) (byte) -1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer6.clear();
        boolean boolean9 = dynamicChannelBuffer6.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray10 = dynamicChannelBuffer6.toByteBuffers();
        dynamicChannelBuffer6.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer15.clear();
        boolean boolean18 = dynamicChannelBuffer15.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray19 = dynamicChannelBuffer15.toByteBuffers();
        boolean boolean21 = dynamicChannelBuffer15.getBoolean((int) (short) 10);
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((-1), (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBufferArray10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBufferArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 0, 10, (int) (short) 10, 2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer1.readBytes(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.duplicate();
        java.lang.Class<?> wildcardClass4 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        boolean boolean3 = dynamicChannelBuffer1.isDirect();
        byte byte5 = dynamicChannelBuffer1.getByte((int) (byte) 0);
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder33 = null;
        int int34 = dynamicChannelBuffer22.indexOf((int) (byte) 100, (int) (short) 100, channelBufferIndexFinder33);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int34 = dynamicChannelBuffer33.writableBytes();
        dynamicChannelBuffer33.clear();
        dynamicChannelBuffer33.setByte((int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        float float15 = dynamicChannelBuffer1.readFloat();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.4E-44f + "'", float15 == 1.4E-44f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        dynamicChannelBuffer1.setByte((int) '#', (int) (short) 100);
        dynamicChannelBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer1.readBytes((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) 'a', (int) ' ', (int) (short) -1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer1.toByteBuffer((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.writeLong((long) 1);
        java.nio.ByteBuffer byteBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        boolean boolean7 = dynamicChannelBuffer1.getBoolean((int) (short) 10);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.setBytes((int) (short) 0, inputStream9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int8 = dynamicChannelBuffer7.writableBytes();
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.writeBytes(byteBuffer9);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.bytesBefore((int) '#', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int8 = dynamicChannelBuffer7.writableBytes();
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.writeBytes(byteBuffer9);
        dynamicChannelBuffer1.setMedium(5, (int) ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = dynamicChannelBuffer1.toString();
        float float17 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer1.bytesBefore((int) 'a', (int) '#', channelBufferIndexFinder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=4, cap=100)" + "'", str15, "DynamicChannelBuffer(ridx=0, widx=4, cap=100)");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.4E-44f + "'", float17 == 1.4E-44f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        short short12 = dynamicChannelBuffer1.readUnsignedByte();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeLong((long) 4);
        dynamicChannelBuffer1.writeBoolean(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer14.writeInt(10);
        int int17 = dynamicChannelBuffer14.readerIndex();
        int int21 = dynamicChannelBuffer14.bytesBefore((int) 'a', 1, (byte) 1);
        int int22 = dynamicChannelBuffer14.readerIndex();
        int int23 = dynamicChannelBuffer14.readerIndex();
        dynamicChannelBuffer14.writeDouble(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.setBytes((int) '#', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int10 = dynamicChannelBuffer9.writableBytes();
        dynamicChannelBuffer6.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) ' ');
        dynamicChannelBuffer9.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dynamicChannelBuffer1.bytesBefore(4, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        boolean boolean8 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray12 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.setIndex(10, (int) (short) 100);
        short short16 = dynamicChannelBuffer11.readShort();
        java.nio.ByteBuffer[] byteBufferArray19 = dynamicChannelBuffer11.toByteBuffers((int) (byte) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertNotNull(byteBufferArray19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeInt((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer8.writeBoolean(true);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        int int11 = dynamicChannelBuffer1.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder10);
        java.lang.Class<?> wildcardClass12 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        dynamicChannelBuffer1.discardReadBytes();
        int int16 = dynamicChannelBuffer1.writerIndex();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        boolean boolean4 = dynamicChannelBuffer1.getBoolean((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray7 = dynamicChannelBuffer6.array();
        dynamicChannelBuffer1.writeBytes(byteArray7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int17 = dynamicChannelBuffer16.writableBytes();
        boolean boolean18 = dynamicChannelBuffer16.isDirect();
        dynamicChannelBuffer11.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, 1);
        boolean boolean21 = dynamicChannelBuffer11.writable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        dynamicChannelBuffer10.writeLong((long) 100);
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer10.setBytes(100, byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, -1, 0, -1]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        boolean boolean8 = dynamicChannelBuffer1.readable();
        byte[] byteArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray9, 1079525376, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray5 = dynamicChannelBuffer4.array();
        dynamicChannelBuffer4.resetWriterIndex();
        dynamicChannelBuffer4.resetReaderIndex();
        dynamicChannelBuffer4.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray12 = dynamicChannelBuffer11.array();
        boolean boolean13 = dynamicChannelBuffer11.writable();
        int int14 = dynamicChannelBuffer4.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) (byte) 0, 0);
        dynamicChannelBuffer4.writeShort(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int22 = dynamicChannelBuffer21.writableBytes();
        boolean boolean24 = dynamicChannelBuffer21.getBoolean((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray27 = dynamicChannelBuffer26.array();
        dynamicChannelBuffer21.writeBytes(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.readBytes(byteArray27, (int) '4', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 35, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        int int18 = dynamicChannelBuffer13.readerIndex();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.bytesBefore((int) 'a', 1, (byte) 1);
        int int9 = dynamicChannelBuffer1.readerIndex();
        int int10 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.setMedium(0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        boolean boolean3 = dynamicChannelBuffer1.isDirect();
        byte byte5 = dynamicChannelBuffer1.getByte((int) (byte) 0);
        dynamicChannelBuffer1.discardReadBytes();
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) (short) -1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        boolean boolean4 = dynamicChannelBuffer1.getBoolean((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray7 = dynamicChannelBuffer6.array();
        dynamicChannelBuffer1.writeBytes(byteArray7);
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dynamicChannelBuffer1.toString(charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        long long8 = dynamicChannelBuffer1.getUnsignedInt((int) (byte) 1);
        dynamicChannelBuffer1.writeMedium(4);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        int int11 = dynamicChannelBuffer1.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder10);
        int int13 = dynamicChannelBuffer1.bytesBefore((byte) 0);
        char char15 = dynamicChannelBuffer1.getChar((int) ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer6.toString((int) (byte) 10, 0, charset20);
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer6.setBytes((int) (short) 100, inputStream23, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        dynamicChannelBuffer1.setInt((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        char char32 = dynamicChannelBuffer22.getChar((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int35 = dynamicChannelBuffer34.writableBytes();
        dynamicChannelBuffer34.clear();
        dynamicChannelBuffer34.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer22.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer34, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        short short12 = dynamicChannelBuffer1.readUnsignedByte();
        short short14 = dynamicChannelBuffer1.getUnsignedByte((int) 'a');
        java.nio.charset.Charset charset17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dynamicChannelBuffer1.toString(4, (int) (short) 10, charset17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        boolean boolean7 = dynamicChannelBuffer1.getBoolean((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        char char32 = dynamicChannelBuffer22.getChar((int) '4');
        dynamicChannelBuffer22.writeInt((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int41 = dynamicChannelBuffer40.writableBytes();
        dynamicChannelBuffer37.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, (int) ' ');
        dynamicChannelBuffer40.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray48 = dynamicChannelBuffer47.array();
        dynamicChannelBuffer47.setIndex(10, (int) (short) 100);
        byte[] byteArray52 = new byte[] {};
        dynamicChannelBuffer47.readBytes(byteArray52);
        boolean boolean54 = dynamicChannelBuffer47.readable();
        int int55 = dynamicChannelBuffer47.writableBytes();
        dynamicChannelBuffer40.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47, (int) (byte) 1);
        dynamicChannelBuffer22.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, 0, (int) (byte) 10);
        dynamicChannelBuffer40.ensureWritableBytes((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        boolean boolean3 = dynamicChannelBuffer1.isDirect();
        byte byte5 = dynamicChannelBuffer1.getByte((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = dynamicChannelBuffer1.getDouble(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        java.nio.ByteBuffer[] byteBufferArray13 = dynamicChannelBuffer6.toByteBuffers((int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            float float15 = dynamicChannelBuffer6.getFloat((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBufferArray13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        java.nio.ByteBuffer byteBuffer3 = dynamicChannelBuffer1.toByteBuffer();
        float float5 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(channelBuffer6, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        int int11 = dynamicChannelBuffer1.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int14 = dynamicChannelBuffer13.writableBytes();
        java.nio.ByteBuffer byteBuffer15 = dynamicChannelBuffer13.toByteBuffer();
        dynamicChannelBuffer1.readBytes(byteBuffer15);
        dynamicChannelBuffer1.markReaderIndex();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel18, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.resetWriterIndex();
        dynamicChannelBuffer5.resetReaderIndex();
        dynamicChannelBuffer5.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray13 = dynamicChannelBuffer12.array();
        boolean boolean14 = dynamicChannelBuffer12.writable();
        int int15 = dynamicChannelBuffer5.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer12.setDouble((int) (byte) 0, (double) 'a');
        int int20 = dynamicChannelBuffer12.getInt(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[64, 88, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1079525376 + "'", int20 == 1079525376);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        char char32 = dynamicChannelBuffer22.getChar((int) '4');
        java.nio.channels.GatheringByteChannel gatheringByteChannel33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = dynamicChannelBuffer22.readBytes(gatheringByteChannel33, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        short short6 = dynamicChannelBuffer1.readShort();
        java.nio.channels.GatheringByteChannel gatheringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readBytes(gatheringByteChannel7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray11 = dynamicChannelBuffer10.array();
        dynamicChannelBuffer10.resetWriterIndex();
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer10.toString(charset13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int17 = dynamicChannelBuffer16.writableBytes();
        java.nio.ByteBuffer byteBuffer18 = dynamicChannelBuffer16.toByteBuffer();
        dynamicChannelBuffer10.writeBytes(byteBuffer18);
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        java.io.InputStream inputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dynamicChannelBuffer1.writeBytes(inputStream21, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.copy((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 0);
        double double8 = dynamicChannelBuffer1.getDouble(2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar(2, 10);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.bytesBefore(4, 4, channelBufferIndexFinder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        dynamicChannelBuffer13.writeByte((int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        byte[] byteArray27 = new byte[] {};
        dynamicChannelBuffer22.readBytes(byteArray27);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder31 = null;
        int int32 = dynamicChannelBuffer22.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder31);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int35 = dynamicChannelBuffer34.writableBytes();
        java.nio.ByteBuffer byteBuffer36 = dynamicChannelBuffer34.toByteBuffer();
        dynamicChannelBuffer22.readBytes(byteBuffer36);
        dynamicChannelBuffer13.setBytes(100, byteBuffer36);
        // The following exception was thrown during execution in test generation
        try {
            char char39 = dynamicChannelBuffer13.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(byteBuffer36);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer1.factory();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.setBytes(5, inputStream6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) 0);
        dynamicChannelBuffer1.writeFloat(0.0f);
        byte byte12 = dynamicChannelBuffer1.getByte(2);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        boolean boolean3 = dynamicChannelBuffer1.writable();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        dynamicChannelBuffer13.writeByte((int) (byte) 10);
        dynamicChannelBuffer13.ensureWritableBytes(4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (5) must be equal to or greater than lengthFieldOffset (10) + lengthFieldLength (4).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        long long8 = dynamicChannelBuffer1.getUnsignedInt((int) (byte) 1);
        boolean boolean9 = dynamicChannelBuffer1.readable();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.arrayOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        dynamicChannelBuffer6.setShort((int) ' ', 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer6.bytesBefore(channelBufferIndexFinder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.writeBytes(inputStream4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        char char32 = dynamicChannelBuffer22.getChar((int) '4');
        dynamicChannelBuffer22.writeInt((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int41 = dynamicChannelBuffer40.writableBytes();
        dynamicChannelBuffer37.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, (int) ' ');
        dynamicChannelBuffer40.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray48 = dynamicChannelBuffer47.array();
        dynamicChannelBuffer47.setIndex(10, (int) (short) 100);
        byte[] byteArray52 = new byte[] {};
        dynamicChannelBuffer47.readBytes(byteArray52);
        boolean boolean54 = dynamicChannelBuffer47.readable();
        int int55 = dynamicChannelBuffer47.writableBytes();
        dynamicChannelBuffer40.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47, (int) (byte) 1);
        dynamicChannelBuffer22.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer63 = dynamicChannelBuffer40.copy(1079525376, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.slice((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.resetWriterIndex();
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer5.toString(charset8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int12 = dynamicChannelBuffer11.writableBytes();
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer11.toByteBuffer();
        dynamicChannelBuffer5.writeBytes(byteBuffer13);
        dynamicChannelBuffer1.readBytes(byteBuffer13);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer1.indexOf(1079525376, (int) (short) 10, channelBufferIndexFinder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer5.clear();
        boolean boolean8 = dynamicChannelBuffer5.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer5.toByteBuffers();
        dynamicChannelBuffer5.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer14.clear();
        boolean boolean17 = dynamicChannelBuffer14.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray18 = dynamicChannelBuffer14.toByteBuffers();
        boolean boolean20 = dynamicChannelBuffer14.getBoolean((int) (short) 10);
        dynamicChannelBuffer5.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray27 = dynamicChannelBuffer26.array();
        dynamicChannelBuffer26.setIndex(10, (int) (short) 100);
        short short31 = dynamicChannelBuffer26.readShort();
        dynamicChannelBuffer5.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26, (int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteBufferArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 0 + "'", short31 == (short) 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar(2, 10);
        int int6 = dynamicChannelBuffer1.arrayOffset();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        int int20 = dynamicChannelBuffer1.readerIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        int int11 = dynamicChannelBuffer1.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int14 = dynamicChannelBuffer13.writableBytes();
        java.nio.ByteBuffer byteBuffer15 = dynamicChannelBuffer13.toByteBuffer();
        dynamicChannelBuffer1.readBytes(byteBuffer15);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray20 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer19.setIndex(10, (int) (short) 100);
        byte[] byteArray24 = new byte[] {};
        dynamicChannelBuffer19.readBytes(byteArray24);
        boolean boolean26 = dynamicChannelBuffer19.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '\000', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, 1, (int) (short) 0, 1079525376, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        java.nio.ByteBuffer[] byteBufferArray13 = dynamicChannelBuffer6.toByteBuffers((int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dynamicChannelBuffer6.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBufferArray13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer6.clear();
        dynamicChannelBuffer6.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int12 = dynamicChannelBuffer11.writableBytes();
        boolean boolean13 = dynamicChannelBuffer11.isDirect();
        dynamicChannelBuffer6.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer18.writeInt(10);
        int int21 = dynamicChannelBuffer18.readerIndex();
        dynamicChannelBuffer11.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        dynamicChannelBuffer18.writeByte((int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray28 = dynamicChannelBuffer27.array();
        dynamicChannelBuffer27.setIndex(10, (int) (short) 100);
        byte[] byteArray32 = new byte[] {};
        dynamicChannelBuffer27.readBytes(byteArray32);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder36 = null;
        int int37 = dynamicChannelBuffer27.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder36);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int40 = dynamicChannelBuffer39.writableBytes();
        java.nio.ByteBuffer byteBuffer41 = dynamicChannelBuffer39.toByteBuffer();
        dynamicChannelBuffer27.readBytes(byteBuffer41);
        dynamicChannelBuffer18.setBytes(100, byteBuffer41);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray47 = dynamicChannelBuffer46.array();
        dynamicChannelBuffer18.getBytes(0, byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(byteBuffer41);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0, 0, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        short short7 = dynamicChannelBuffer1.readShort();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 35 + "'", short7 == (short) 35);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        boolean boolean8 = dynamicChannelBuffer1.readable();
        int int9 = dynamicChannelBuffer1.writableBytes();
        byte byte10 = dynamicChannelBuffer1.readByte();
        java.lang.String str11 = dynamicChannelBuffer1.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=11, widx=100, cap=100)" + "'", str11, "DynamicChannelBuffer(ridx=11, widx=100, cap=100)");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer1.factory();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) 0);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteBufferArray9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        java.nio.ByteBuffer byteBuffer3 = dynamicChannelBuffer1.toByteBuffer();
        float float5 = dynamicChannelBuffer1.getFloat(0);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = dynamicChannelBuffer1.getUnsignedByte((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        java.nio.ByteBuffer byteBuffer3 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        char char32 = dynamicChannelBuffer22.getChar((int) '4');
        dynamicChannelBuffer22.writeInt((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int41 = dynamicChannelBuffer40.writableBytes();
        dynamicChannelBuffer37.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, (int) ' ');
        dynamicChannelBuffer40.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray48 = dynamicChannelBuffer47.array();
        dynamicChannelBuffer47.setIndex(10, (int) (short) 100);
        byte[] byteArray52 = new byte[] {};
        dynamicChannelBuffer47.readBytes(byteArray52);
        boolean boolean54 = dynamicChannelBuffer47.readable();
        int int55 = dynamicChannelBuffer47.writableBytes();
        dynamicChannelBuffer40.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47, (int) (byte) 1);
        dynamicChannelBuffer22.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, 0, (int) (byte) 10);
        java.nio.ByteBuffer byteBuffer61 = dynamicChannelBuffer40.toByteBuffer();
        java.nio.charset.Charset charset64 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = dynamicChannelBuffer40.toString((int) (byte) 0, (int) (byte) -1, charset64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteBuffer61);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 2, 5, 5, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray5 = dynamicChannelBuffer4.array();
        dynamicChannelBuffer4.resetWriterIndex();
        dynamicChannelBuffer4.resetReaderIndex();
        dynamicChannelBuffer4.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray12 = dynamicChannelBuffer11.array();
        boolean boolean13 = dynamicChannelBuffer11.writable();
        int int14 = dynamicChannelBuffer4.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) (byte) 0, 0);
        dynamicChannelBuffer4.writeShort(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int22 = dynamicChannelBuffer21.writableBytes();
        dynamicChannelBuffer21.clear();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, (-1), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 35, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        int int5 = dynamicChannelBuffer1.arrayOffset();
        dynamicChannelBuffer1.writeMedium(1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        dynamicChannelBuffer1.writeDouble((double) 100.0f);
        dynamicChannelBuffer1.setDouble((int) (byte) 10, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        boolean boolean7 = dynamicChannelBuffer1.getBoolean((int) (short) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int11 = dynamicChannelBuffer10.writableBytes();
        dynamicChannelBuffer10.clear();
        dynamicChannelBuffer10.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer10.ensureWritableBytes((int) (byte) 0);
        dynamicChannelBuffer10.writeFloat(0.0f);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer6.copy();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(channelBuffer11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer6.toString((int) (byte) 10, 0, charset20);
        int int22 = dynamicChannelBuffer6.writerIndex();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        dynamicChannelBuffer1.discardReadBytes();
        byte byte17 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = dynamicChannelBuffer1.copy((int) (short) 1, 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer20);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) ' ');
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.indexOf((int) (byte) 10, (int) (short) -1, channelBufferIndexFinder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        int int12 = dynamicChannelBuffer1.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        int int18 = dynamicChannelBuffer6.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = dynamicChannelBuffer6.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setChar((int) (short) 10, (int) (short) 100);
        dynamicChannelBuffer1.discardReadBytes();
        double double8 = dynamicChannelBuffer1.getDouble((int) (short) 35);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = dynamicChannelBuffer1.toString();
        float float17 = dynamicChannelBuffer1.getFloat(0);
        byte[] byteArray18 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=4, cap=100)" + "'", str15, "DynamicChannelBuffer(ridx=0, widx=4, cap=100)");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.4E-44f + "'", float17 == 1.4E-44f);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer20.clear();
        boolean boolean23 = dynamicChannelBuffer20.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray24 = dynamicChannelBuffer20.toByteBuffers();
        dynamicChannelBuffer20.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer29.clear();
        boolean boolean32 = dynamicChannelBuffer29.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray33 = dynamicChannelBuffer29.toByteBuffers();
        boolean boolean35 = dynamicChannelBuffer29.getBoolean((int) (short) 10);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray42 = dynamicChannelBuffer41.array();
        dynamicChannelBuffer41.setIndex(10, (int) (short) 100);
        short short46 = dynamicChannelBuffer41.readShort();
        dynamicChannelBuffer20.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer41, (int) ' ', 1);
        byte[] byteArray50 = dynamicChannelBuffer20.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer13.getBytes((int) (short) 100, byteArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBufferArray24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteBufferArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 0 + "'", short46 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.readable();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.setBytes((int) (short) 1, inputStream6, 1079525376);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = dynamicChannelBuffer1.toString();
        float float17 = dynamicChannelBuffer1.getFloat(0);
        byte[] byteArray18 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.writeByte((int) (byte) -1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray24 = dynamicChannelBuffer23.array();
        dynamicChannelBuffer23.setIndex(10, (int) (short) 100);
        byte[] byteArray28 = new byte[] {};
        dynamicChannelBuffer23.readBytes(byteArray28);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer23.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(10, channelBuffer30, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=4, cap=100)" + "'", str15, "DynamicChannelBuffer(ridx=0, widx=4, cap=100)");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.4E-44f + "'", float17 == 1.4E-44f);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 10, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(channelBuffer30);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeZero((int) (short) 10);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        dynamicChannelBuffer4.resetReaderIndex();
        boolean boolean9 = dynamicChannelBuffer4.readBoolean();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.skipBytes((int) (short) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        java.lang.String str4 = dynamicChannelBuffer1.toString();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.setBytes((int) '4', scatteringByteChannel6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=100)" + "'", str4, "DynamicChannelBuffer(ridx=0, widx=0, cap=100)");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        dynamicChannelBuffer1.discardReadBytes();
        byte byte17 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean(100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer18);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.readSlice(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(channelBuffer9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer1.factory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes(90);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer8.setDouble((int) (byte) 0, (double) 'a');
        dynamicChannelBuffer8.writeFloat((float) 1L);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[63, -128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        boolean boolean4 = dynamicChannelBuffer1.getBoolean((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeFloat((float) 2);
        short short8 = dynamicChannelBuffer1.getShort((int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int11 = dynamicChannelBuffer10.writableBytes();
        java.nio.ByteBuffer byteBuffer12 = dynamicChannelBuffer10.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int16 = dynamicChannelBuffer15.writableBytes();
        boolean boolean18 = dynamicChannelBuffer15.getBoolean((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray21 = dynamicChannelBuffer20.array();
        dynamicChannelBuffer15.writeBytes(byteArray21);
        dynamicChannelBuffer10.setBytes((int) (short) 0, byteArray21, (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        boolean boolean3 = dynamicChannelBuffer1.writable();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.setBytes(2, byteArray6);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer9.clear();
        boolean boolean12 = dynamicChannelBuffer9.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray13 = dynamicChannelBuffer9.toByteBuffers();
        dynamicChannelBuffer9.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer18.clear();
        boolean boolean21 = dynamicChannelBuffer18.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray22 = dynamicChannelBuffer18.toByteBuffers();
        boolean boolean24 = dynamicChannelBuffer18.getBoolean((int) (short) 10);
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray31 = dynamicChannelBuffer30.array();
        dynamicChannelBuffer30.setIndex(10, (int) (short) 100);
        short short35 = dynamicChannelBuffer30.readShort();
        dynamicChannelBuffer9.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30, (int) ' ', 1);
        char char40 = dynamicChannelBuffer30.getChar((int) '4');
        dynamicChannelBuffer30.writeInt((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer45 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int49 = dynamicChannelBuffer48.writableBytes();
        dynamicChannelBuffer45.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48, (int) ' ');
        dynamicChannelBuffer48.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray56 = dynamicChannelBuffer55.array();
        dynamicChannelBuffer55.setIndex(10, (int) (short) 100);
        byte[] byteArray60 = new byte[] {};
        dynamicChannelBuffer55.readBytes(byteArray60);
        boolean boolean62 = dynamicChannelBuffer55.readable();
        int int63 = dynamicChannelBuffer55.writableBytes();
        dynamicChannelBuffer48.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer55, (int) (byte) 1);
        dynamicChannelBuffer30.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48, 0, (int) (byte) 10);
        java.nio.ByteBuffer byteBuffer69 = dynamicChannelBuffer48.toByteBuffer();
        dynamicChannelBuffer1.writeBytes(byteBuffer69);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteBufferArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 0 + "'", short35 == (short) 0);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\000' + "'", char40 == '\000');
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteBuffer69);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        dynamicChannelBuffer1.setByte((int) '#', (int) (short) 100);
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray14 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray18 = dynamicChannelBuffer17.array();
        dynamicChannelBuffer17.resetWriterIndex();
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer17.toString(charset20);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int24 = dynamicChannelBuffer23.writableBytes();
        java.nio.ByteBuffer byteBuffer25 = dynamicChannelBuffer23.toByteBuffer();
        dynamicChannelBuffer17.writeBytes(byteBuffer25);
        dynamicChannelBuffer13.readBytes(byteBuffer25);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteBuffer25);
        java.lang.Class<?> wildcardClass29 = byteBuffer25.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer1.factory();
        dynamicChannelBuffer1.writeByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer8.writeInt(10);
        dynamicChannelBuffer8.clear();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = dynamicChannelBuffer8.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.resetWriterIndex();
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer5.toString(charset8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int12 = dynamicChannelBuffer11.writableBytes();
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer11.toByteBuffer();
        dynamicChannelBuffer5.writeBytes(byteBuffer13);
        dynamicChannelBuffer1.readBytes(byteBuffer13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer18.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        java.lang.String str27 = dynamicChannelBuffer22.toString();
        dynamicChannelBuffer18.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer18.setZero((int) (short) 0, (int) (byte) 1);
        java.lang.String str32 = dynamicChannelBuffer18.toString();
        float float34 = dynamicChannelBuffer18.getFloat(0);
        byte[] byteArray35 = dynamicChannelBuffer18.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 1, byteArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str27, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=4, cap=100)" + "'", str32, "DynamicChannelBuffer(ridx=0, widx=4, cap=100)");
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.4E-44f + "'", float34 == 1.4E-44f);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer6.toString((int) (byte) 10, 0, charset20);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer23.clear();
        boolean boolean26 = dynamicChannelBuffer23.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray27 = dynamicChannelBuffer23.toByteBuffers();
        dynamicChannelBuffer23.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer32.clear();
        boolean boolean35 = dynamicChannelBuffer32.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray36 = dynamicChannelBuffer32.toByteBuffers();
        boolean boolean38 = dynamicChannelBuffer32.getBoolean((int) (short) 10);
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray45 = dynamicChannelBuffer44.array();
        dynamicChannelBuffer44.setIndex(10, (int) (short) 100);
        short short49 = dynamicChannelBuffer44.readShort();
        dynamicChannelBuffer23.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer44, (int) ' ', 1);
        char char54 = dynamicChannelBuffer44.getChar((int) '4');
        dynamicChannelBuffer44.writeInt((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer62 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int63 = dynamicChannelBuffer62.writableBytes();
        dynamicChannelBuffer59.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer62, (int) ' ');
        dynamicChannelBuffer62.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer69 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray70 = dynamicChannelBuffer69.array();
        dynamicChannelBuffer69.setIndex(10, (int) (short) 100);
        byte[] byteArray74 = new byte[] {};
        dynamicChannelBuffer69.readBytes(byteArray74);
        boolean boolean76 = dynamicChannelBuffer69.readable();
        int int77 = dynamicChannelBuffer69.writableBytes();
        dynamicChannelBuffer62.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer69, (int) (byte) 1);
        dynamicChannelBuffer44.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer62, 0, (int) (byte) 10);
        java.nio.ByteBuffer byteBuffer83 = dynamicChannelBuffer62.toByteBuffer();
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer62);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteBufferArray27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteBufferArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 0 + "'", short49 == (short) 0);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + '\000' + "'", char54 == '\000');
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(byteBuffer83);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 100, channelBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore((int) (byte) 0, 4, channelBufferIndexFinder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        int int12 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.writeChar((-1));
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.readSlice((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = dynamicChannelBuffer1.getByte(4217088);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4217088");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(channelBuffer9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.bytesBefore((int) 'a', 1, (byte) 1);
        float float10 = dynamicChannelBuffer1.getFloat(4);
        byte byte12 = dynamicChannelBuffer1.getByte(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = dynamicChannelBuffer1.toString();
        float float17 = dynamicChannelBuffer1.getFloat(0);
        int int18 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray22 = dynamicChannelBuffer21.array();
        boolean boolean23 = dynamicChannelBuffer21.writable();
        java.nio.ByteBuffer byteBuffer24 = dynamicChannelBuffer21.toByteBuffer();
        byte[] byteArray26 = new byte[] {};
        dynamicChannelBuffer21.setBytes(2, byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((-1), byteArray26, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=4, cap=100)" + "'", str15, "DynamicChannelBuffer(ridx=0, widx=4, cap=100)");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.4E-44f + "'", float17 == 1.4E-44f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteBuffer24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) 0);
        dynamicChannelBuffer1.writeFloat(0.0f);
        byte byte12 = dynamicChannelBuffer1.getByte(2);
        dynamicChannelBuffer1.setByte(2, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        int int6 = dynamicChannelBuffer1.arrayOffset();
        int int7 = dynamicChannelBuffer1.arrayOffset();
        int int8 = dynamicChannelBuffer1.readableBytes();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dynamicChannelBuffer1.getBoolean(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        dynamicChannelBuffer4.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray12 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.setIndex(10, (int) (short) 100);
        byte[] byteArray16 = new byte[] {};
        dynamicChannelBuffer11.readBytes(byteArray16);
        boolean boolean18 = dynamicChannelBuffer11.readable();
        int int19 = dynamicChannelBuffer11.writableBytes();
        dynamicChannelBuffer4.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer11.copy(4217088, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        int int6 = dynamicChannelBuffer1.arrayOffset();
        int int7 = dynamicChannelBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            short short9 = dynamicChannelBuffer1.getShort(1079525376);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1079525376");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((-1), (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray5 = dynamicChannelBuffer4.array();
        dynamicChannelBuffer4.resetWriterIndex();
        dynamicChannelBuffer4.resetReaderIndex();
        dynamicChannelBuffer4.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray12 = dynamicChannelBuffer11.array();
        boolean boolean13 = dynamicChannelBuffer11.writable();
        int int14 = dynamicChannelBuffer4.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) (byte) 0, 0);
        dynamicChannelBuffer4.writeShort(1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = dynamicChannelBuffer4.duplicate();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 35, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(channelBuffer20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeFloat((float) 2);
        short short8 = dynamicChannelBuffer1.getShort((int) (byte) 10);
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.setBytes(3, inputStream10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.resetWriterIndex();
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer5.toString(charset8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int12 = dynamicChannelBuffer11.writableBytes();
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer11.toByteBuffer();
        dynamicChannelBuffer5.writeBytes(byteBuffer13);
        dynamicChannelBuffer1.readBytes(byteBuffer13);
        int int16 = dynamicChannelBuffer1.writableBytes();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        java.lang.String str4 = dynamicChannelBuffer1.toString();
        int int6 = dynamicChannelBuffer1.getUnsignedShort(0);
        dynamicChannelBuffer1.writeZero(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=100)" + "'", str4, "DynamicChannelBuffer(ridx=0, widx=0, cap=100)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        boolean boolean7 = dynamicChannelBuffer1.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writerIndex(0);
        dynamicChannelBuffer1.writeMedium((int) '\000');
        dynamicChannelBuffer1.readerIndex(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 1);
        byte[] byteArray10 = dynamicChannelBuffer1.array();
        java.nio.channels.GatheringByteChannel gatheringByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.getBytes(1079525376, gatheringByteChannel12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        java.nio.ByteBuffer[] byteBufferArray13 = dynamicChannelBuffer6.toByteBuffers((int) (short) 100, 0);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer6.toByteBuffers();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer6.slice();
        int int18 = dynamicChannelBuffer6.bytesBefore(0, (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        dynamicChannelBuffer13.writeByte((int) (byte) 10);
        int int23 = dynamicChannelBuffer13.indexOf((int) (short) 0, 0, (byte) 100);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = dynamicChannelBuffer13.indexOf((int) (byte) 1, (int) '\000', channelBufferIndexFinder26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray11 = dynamicChannelBuffer10.array();
        dynamicChannelBuffer10.resetWriterIndex();
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer10.toString(charset13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int17 = dynamicChannelBuffer16.writableBytes();
        java.nio.ByteBuffer byteBuffer18 = dynamicChannelBuffer16.toByteBuffer();
        dynamicChannelBuffer10.writeBytes(byteBuffer18);
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        dynamicChannelBuffer1.writeMedium(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) ' ');
        int int25 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer28.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray33 = dynamicChannelBuffer32.array();
        dynamicChannelBuffer32.setIndex(10, (int) (short) 100);
        java.lang.String str37 = dynamicChannelBuffer32.toString();
        dynamicChannelBuffer28.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32);
        dynamicChannelBuffer28.setZero((int) (short) 0, (int) (byte) 1);
        short short42 = dynamicChannelBuffer28.readUnsignedByte();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer24.setBytes(1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer28, 1079525376);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str37, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 0 + "'", short42 == (short) 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 0);
        boolean boolean8 = dynamicChannelBuffer1.getBoolean(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.writeInt(10);
        int int13 = dynamicChannelBuffer10.readerIndex();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        dynamicChannelBuffer13.writeByte((int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        byte[] byteArray27 = new byte[] {};
        dynamicChannelBuffer22.readBytes(byteArray27);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder31 = null;
        int int32 = dynamicChannelBuffer22.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder31);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int35 = dynamicChannelBuffer34.writableBytes();
        java.nio.ByteBuffer byteBuffer36 = dynamicChannelBuffer34.toByteBuffer();
        dynamicChannelBuffer22.readBytes(byteBuffer36);
        dynamicChannelBuffer13.setBytes(100, byteBuffer36);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray42 = dynamicChannelBuffer41.array();
        dynamicChannelBuffer13.getBytes(0, byteArray42);
        java.nio.channels.GatheringByteChannel gatheringByteChannel44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = dynamicChannelBuffer13.readBytes(gatheringByteChannel44, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 0, 0, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int9 = dynamicChannelBuffer8.writableBytes();
        java.nio.ByteBuffer byteBuffer10 = dynamicChannelBuffer8.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int14 = dynamicChannelBuffer13.writableBytes();
        boolean boolean16 = dynamicChannelBuffer13.getBoolean((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray19 = dynamicChannelBuffer18.array();
        dynamicChannelBuffer13.writeBytes(byteArray19);
        dynamicChannelBuffer8.setBytes((int) (short) 0, byteArray19, (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(2, byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        long long8 = dynamicChannelBuffer4.readLong();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.writeZero((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length must be 0 or greater than 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray5 = dynamicChannelBuffer4.array();
        dynamicChannelBuffer4.resetWriterIndex();
        dynamicChannelBuffer4.resetReaderIndex();
        dynamicChannelBuffer4.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray12 = dynamicChannelBuffer11.array();
        boolean boolean13 = dynamicChannelBuffer11.writable();
        int int14 = dynamicChannelBuffer4.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) (byte) 0, 0);
        dynamicChannelBuffer4.setZero((int) '\000', (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = dynamicChannelBuffer1.toString();
        float float17 = dynamicChannelBuffer1.getFloat(0);
        int int18 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.setDouble(5, (double) 1079525376);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=4, cap=100)" + "'", str15, "DynamicChannelBuffer(ridx=0, widx=4, cap=100)");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.4E-44f + "'", float17 == 1.4E-44f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int8 = dynamicChannelBuffer7.writableBytes();
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.writeBytes(byteBuffer9);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int16 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer12.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer1.factory();
        dynamicChannelBuffer1.writeByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer8.writeInt(10);
        dynamicChannelBuffer8.clear();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) dynamicChannelBuffer8);
        int int14 = dynamicChannelBuffer1.getInt(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 167772160 + "'", int14 == 167772160);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 0);
        boolean boolean8 = dynamicChannelBuffer1.getBoolean(0);
        long long10 = dynamicChannelBuffer1.getLong((int) (byte) 10);
        dynamicChannelBuffer1.setBoolean(4, true);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        boolean boolean7 = dynamicChannelBuffer1.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writerIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = dynamicChannelBuffer1.toString();
        float float17 = dynamicChannelBuffer1.getFloat(0);
        byte[] byteArray18 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int21 = dynamicChannelBuffer20.writableBytes();
        dynamicChannelBuffer20.clear();
        int int25 = dynamicChannelBuffer20.bytesBefore(0, (byte) -1);
        dynamicChannelBuffer20.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, 167772160, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=4, cap=100)" + "'", str15, "DynamicChannelBuffer(ridx=0, widx=4, cap=100)");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.4E-44f + "'", float17 == 1.4E-44f);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        long long8 = dynamicChannelBuffer4.readLong();
        dynamicChannelBuffer4.writeChar((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        dynamicChannelBuffer1.setByte((int) '#', (int) (short) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeBoolean(true);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.duplicate();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertNotNull(channelBuffer13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        short short6 = dynamicChannelBuffer1.readShort();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.readBytes(2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray11 = dynamicChannelBuffer10.array();
        dynamicChannelBuffer1.writeBytes(byteArray11);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer14.clear();
        dynamicChannelBuffer14.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int20 = dynamicChannelBuffer19.writableBytes();
        boolean boolean21 = dynamicChannelBuffer19.isDirect();
        dynamicChannelBuffer14.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19, 1);
        java.nio.ByteBuffer[] byteBufferArray26 = dynamicChannelBuffer19.toByteBuffers((int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19, (int) (byte) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteBufferArray26);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer1.factory();
        int int5 = dynamicChannelBuffer1.writerIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer8.setDouble((int) (byte) 0, (double) 'a');
        int int18 = dynamicChannelBuffer8.indexOf((-1), 5, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[64, 88, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.factory();
        int int6 = dynamicChannelBuffer1.readableBytes();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 0);
        java.nio.ByteBuffer[] byteBufferArray7 = dynamicChannelBuffer1.toByteBuffers();
        int int9 = dynamicChannelBuffer1.bytesBefore((byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        java.nio.ByteBuffer byteBuffer3 = dynamicChannelBuffer1.toByteBuffer();
        float float5 = dynamicChannelBuffer1.getFloat(0);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = dynamicChannelBuffer1.getUnsignedByte((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 1);
        byte[] byteArray10 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.writeDouble(0.0d);
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.setBytes(10, inputStream14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.slice((int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        int int6 = dynamicChannelBuffer1.bytesBefore(0, (byte) -1);
        dynamicChannelBuffer1.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        java.lang.String str15 = dynamicChannelBuffer1.toString();
        float float17 = dynamicChannelBuffer1.getFloat(0);
        int int18 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer21.clear();
        boolean boolean24 = dynamicChannelBuffer21.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray25 = dynamicChannelBuffer21.toByteBuffers();
        boolean boolean27 = dynamicChannelBuffer21.getBoolean((int) (short) 10);
        dynamicChannelBuffer21.writeBoolean(true);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) -1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, 3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=4, cap=100)" + "'", str15, "DynamicChannelBuffer(ridx=0, widx=4, cap=100)");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.4E-44f + "'", float17 == 1.4E-44f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteBufferArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray5 = dynamicChannelBuffer4.array();
        dynamicChannelBuffer4.resetWriterIndex();
        dynamicChannelBuffer4.resetReaderIndex();
        dynamicChannelBuffer4.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray12 = dynamicChannelBuffer11.array();
        boolean boolean13 = dynamicChannelBuffer11.writable();
        int int14 = dynamicChannelBuffer4.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) (byte) 0, 0);
        dynamicChannelBuffer4.writeShort(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.resetWriterIndex();
        dynamicChannelBuffer22.markWriterIndex();
        dynamicChannelBuffer22.writeFloat((float) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.getBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) '4', 4217088);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 35, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        char char32 = dynamicChannelBuffer22.getChar((int) '4');
        short short34 = dynamicChannelBuffer22.getUnsignedByte((int) '4');
        boolean boolean35 = dynamicChannelBuffer22.writable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 0 + "'", short34 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.resetWriterIndex();
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer5.toString(charset8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int12 = dynamicChannelBuffer11.writableBytes();
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer11.toByteBuffer();
        dynamicChannelBuffer5.writeBytes(byteBuffer13);
        dynamicChannelBuffer1.readBytes(byteBuffer13);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer1.bytesBefore(4, (int) (short) 100, channelBufferIndexFinder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(byteBuffer13);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        int int21 = dynamicChannelBuffer10.getUnsignedMedium(0);
        dynamicChannelBuffer10.setByte(90, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.factory();
        short short7 = dynamicChannelBuffer1.getUnsignedByte((int) ' ');
        byte byte9 = dynamicChannelBuffer1.getByte(0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) 0);
        dynamicChannelBuffer1.writeFloat(0.0f);
        byte byte12 = dynamicChannelBuffer1.getByte(2);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer1.readBytes(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        int int8 = dynamicChannelBuffer1.bytesBefore((byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        boolean boolean8 = dynamicChannelBuffer1.readable();
        int int9 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer1.factory();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.resetWriterIndex();
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer5.toString(charset8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int12 = dynamicChannelBuffer11.writableBytes();
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer11.toByteBuffer();
        dynamicChannelBuffer5.writeBytes(byteBuffer13);
        dynamicChannelBuffer1.readBytes(byteBuffer13);
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = dynamicChannelBuffer1.toString(charset16);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        int int18 = dynamicChannelBuffer6.arrayOffset();
        dynamicChannelBuffer6.resetReaderIndex();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        int int11 = dynamicChannelBuffer1.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int14 = dynamicChannelBuffer13.writableBytes();
        java.nio.ByteBuffer byteBuffer15 = dynamicChannelBuffer13.toByteBuffer();
        dynamicChannelBuffer1.readBytes(byteBuffer15);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray20 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer19.resetWriterIndex();
        dynamicChannelBuffer19.resetReaderIndex();
        dynamicChannelBuffer19.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray27 = dynamicChannelBuffer26.array();
        boolean boolean28 = dynamicChannelBuffer26.writable();
        int int29 = dynamicChannelBuffer19.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer31.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray36 = dynamicChannelBuffer35.array();
        dynamicChannelBuffer35.setIndex(10, (int) (short) 100);
        java.lang.String str40 = dynamicChannelBuffer35.toString();
        dynamicChannelBuffer31.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer35);
        dynamicChannelBuffer19.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer31);
        dynamicChannelBuffer19.writeInt(167772160);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer46.clear();
        boolean boolean49 = dynamicChannelBuffer46.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray50 = dynamicChannelBuffer46.toByteBuffers();
        dynamicChannelBuffer46.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer55.clear();
        boolean boolean58 = dynamicChannelBuffer55.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray59 = dynamicChannelBuffer55.toByteBuffers();
        boolean boolean61 = dynamicChannelBuffer55.getBoolean((int) (short) 10);
        dynamicChannelBuffer46.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer55, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer67 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray68 = dynamicChannelBuffer67.array();
        dynamicChannelBuffer67.setIndex(10, (int) (short) 100);
        short short72 = dynamicChannelBuffer67.readShort();
        dynamicChannelBuffer46.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer67, (int) ' ', 1);
        char char77 = dynamicChannelBuffer67.getChar((int) '4');
        dynamicChannelBuffer67.writeInt((int) '4');
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder82 = null;
        int int83 = dynamicChannelBuffer67.indexOf((int) (byte) -1, (int) (short) -1, channelBufferIndexFinder82);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer85 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer85.clear();
        dynamicChannelBuffer85.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer90 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int91 = dynamicChannelBuffer90.writableBytes();
        boolean boolean92 = dynamicChannelBuffer90.isDirect();
        dynamicChannelBuffer85.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer90, 1);
        java.nio.ByteBuffer byteBuffer95 = dynamicChannelBuffer85.toByteBuffer();
        dynamicChannelBuffer67.writeBytes(byteBuffer95);
        dynamicChannelBuffer19.writeBytes(byteBuffer95);
        dynamicChannelBuffer1.getBytes((int) (short) 0, byteBuffer95);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 35, 0, 0, 0, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str40, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteBufferArray50);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteBufferArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 0 + "'", short72 == (short) 0);
        org.junit.Assert.assertTrue("'" + char77 + "' != '" + '\000' + "'", char77 == '\000');
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(byteBuffer95);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray11 = dynamicChannelBuffer10.array();
        dynamicChannelBuffer10.resetWriterIndex();
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer10.toString(charset13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int17 = dynamicChannelBuffer16.writableBytes();
        java.nio.ByteBuffer byteBuffer18 = dynamicChannelBuffer16.toByteBuffer();
        dynamicChannelBuffer10.writeBytes(byteBuffer18);
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer22.clear();
        boolean boolean25 = dynamicChannelBuffer22.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray26 = dynamicChannelBuffer22.toByteBuffers();
        dynamicChannelBuffer22.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer31.clear();
        boolean boolean34 = dynamicChannelBuffer31.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray35 = dynamicChannelBuffer31.toByteBuffers();
        boolean boolean37 = dynamicChannelBuffer31.getBoolean((int) (short) 10);
        dynamicChannelBuffer22.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer31, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray44 = dynamicChannelBuffer43.array();
        dynamicChannelBuffer43.setIndex(10, (int) (short) 100);
        short short48 = dynamicChannelBuffer43.readShort();
        dynamicChannelBuffer22.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer43, (int) ' ', 1);
        char char53 = dynamicChannelBuffer43.getChar((int) '4');
        dynamicChannelBuffer43.writeInt((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer58 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer61 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int62 = dynamicChannelBuffer61.writableBytes();
        dynamicChannelBuffer58.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer61, (int) ' ');
        dynamicChannelBuffer61.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer68 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray69 = dynamicChannelBuffer68.array();
        dynamicChannelBuffer68.setIndex(10, (int) (short) 100);
        byte[] byteArray73 = new byte[] {};
        dynamicChannelBuffer68.readBytes(byteArray73);
        boolean boolean75 = dynamicChannelBuffer68.readable();
        int int76 = dynamicChannelBuffer68.writableBytes();
        dynamicChannelBuffer61.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer68, (int) (byte) 1);
        dynamicChannelBuffer43.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer61, 0, (int) (byte) 10);
        java.nio.ByteBuffer byteBuffer82 = dynamicChannelBuffer61.toByteBuffer();
        dynamicChannelBuffer1.writeBytes(byteBuffer82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteBufferArray26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteBufferArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 0 + "'", short48 == (short) 0);
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(byteBuffer82);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        java.nio.ByteBuffer byteBuffer3 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean9 = dynamicChannelBuffer6.getBoolean((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray12 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer6.writeBytes(byteArray12);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray12, (int) '4', 10);
        int int18 = dynamicChannelBuffer1.getUnsignedShort((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        dynamicChannelBuffer4.resetReaderIndex();
        dynamicChannelBuffer4.clear();
        dynamicChannelBuffer4.setChar((int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = dynamicChannelBuffer4.getDouble((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        int int5 = dynamicChannelBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.getInt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        boolean boolean3 = dynamicChannelBuffer1.writable();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        double double6 = dynamicChannelBuffer1.getDouble(5);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        dynamicChannelBuffer1.clear();
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int9 = dynamicChannelBuffer8.writableBytes();
        dynamicChannelBuffer8.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer8.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder5, (int) '\000', channelBufferFactory11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dynamicChannelBuffer12.getBoolean((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 4217088, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer5.clear();
        dynamicChannelBuffer5.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int11 = dynamicChannelBuffer10.writableBytes();
        boolean boolean12 = dynamicChannelBuffer10.isDirect();
        dynamicChannelBuffer5.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 1);
        dynamicChannelBuffer10.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int19 = dynamicChannelBuffer18.writableBytes();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer18.toByteBuffer();
        dynamicChannelBuffer10.getBytes((int) (byte) 1, byteBuffer20);
        dynamicChannelBuffer1.writeBytes(byteBuffer20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        java.nio.ByteBuffer byteBuffer3 = dynamicChannelBuffer1.toByteBuffer();
        dynamicChannelBuffer1.markWriterIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteBuffer3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int12 = dynamicChannelBuffer5.readerIndex();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        dynamicChannelBuffer1.setByte((int) '#', (int) (short) 100);
        int int11 = dynamicChannelBuffer1.getUnsignedMedium((int) ' ');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(channelBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        dynamicChannelBuffer1.clear();
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer8.writeInt(10);
        dynamicChannelBuffer8.clear();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer8.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int16 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer15.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer15.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) (byte) 100, channelBufferFactory18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.resetWriterIndex();
        dynamicChannelBuffer22.markWriterIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer22.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) (byte) 100, channelBufferFactory26);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder5, 2, channelBufferFactory26);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer28.slice();
        dynamicChannelBuffer28.writeBoolean(false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertNotNull(channelBuffer29);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        int int6 = dynamicChannelBuffer1.arrayOffset();
        dynamicChannelBuffer1.setDouble((int) '#', (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer1.slice(1079525376, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 65, -128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        char char32 = dynamicChannelBuffer22.getChar((int) '4');
        dynamicChannelBuffer22.writeInt((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int41 = dynamicChannelBuffer40.writableBytes();
        dynamicChannelBuffer37.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, (int) ' ');
        dynamicChannelBuffer40.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray48 = dynamicChannelBuffer47.array();
        dynamicChannelBuffer47.setIndex(10, (int) (short) 100);
        byte[] byteArray52 = new byte[] {};
        dynamicChannelBuffer47.readBytes(byteArray52);
        boolean boolean54 = dynamicChannelBuffer47.readable();
        int int55 = dynamicChannelBuffer47.writableBytes();
        dynamicChannelBuffer40.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47, (int) (byte) 1);
        dynamicChannelBuffer22.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, 0, (int) (byte) 10);
        java.nio.ByteBuffer byteBuffer61 = dynamicChannelBuffer40.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer63 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer63.writeInt(10);
        int int66 = dynamicChannelBuffer63.readerIndex();
        char char67 = dynamicChannelBuffer63.readChar();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer70 = dynamicChannelBuffer63.slice(10, (int) (short) 10);
        dynamicChannelBuffer40.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer63);
        dynamicChannelBuffer40.writeFloat((float) '#');
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder75 = null;
        int int76 = dynamicChannelBuffer40.bytesBefore((int) (short) 0, channelBufferIndexFinder75);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + char67 + "' != '" + '\000' + "'", char67 == '\000');
        org.junit.Assert.assertNotNull(channelBuffer70);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.resetReaderIndex();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        dynamicChannelBuffer4.resetReaderIndex();
        dynamicChannelBuffer4.clear();
        dynamicChannelBuffer4.writeInt(1079525376);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt(4217088, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4217088");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeZero((int) (short) 10);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray8 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.resetWriterIndex();
        dynamicChannelBuffer7.markWriterIndex();
        dynamicChannelBuffer7.discardReadBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer7.readSlice((int) (byte) 0);
        dynamicChannelBuffer1.readBytes(channelBuffer13);
        java.nio.channels.GatheringByteChannel gatheringByteChannel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dynamicChannelBuffer1.getBytes((int) (byte) -1, gatheringByteChannel16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBuffer13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer8.resetWriterIndex();
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer8.toString(charset11);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int15 = dynamicChannelBuffer14.writableBytes();
        java.nio.ByteBuffer byteBuffer16 = dynamicChannelBuffer14.toByteBuffer();
        dynamicChannelBuffer8.writeBytes(byteBuffer16);
        dynamicChannelBuffer1.setBytes(10, byteBuffer16);
        dynamicChannelBuffer1.setShort(0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        dynamicChannelBuffer4.writeFloat((float) (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeLong((long) 4);
        dynamicChannelBuffer1.discardReadBytes();
        double double8 = dynamicChannelBuffer1.readDouble();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.12199579097E-313d + "'", double8 == 2.12199579097E-313d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.bytesBefore((int) 'a', 1, (byte) 1);
        float float10 = dynamicChannelBuffer1.getFloat(4);
        char char12 = dynamicChannelBuffer1.getChar((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int5 = dynamicChannelBuffer4.writableBytes();
        dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) ' ');
        dynamicChannelBuffer4.resetReaderIndex();
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dynamicChannelBuffer4.toString(charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setBoolean((int) '\000', true);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray11 = dynamicChannelBuffer10.array();
        dynamicChannelBuffer10.resetWriterIndex();
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer10.toString(charset13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int17 = dynamicChannelBuffer16.writableBytes();
        java.nio.ByteBuffer byteBuffer18 = dynamicChannelBuffer16.toByteBuffer();
        dynamicChannelBuffer10.writeBytes(byteBuffer18);
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        dynamicChannelBuffer1.writeMedium(10);
        int int24 = dynamicChannelBuffer1.bytesBefore((byte) 100);
        boolean boolean26 = dynamicChannelBuffer1.getBoolean((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        byte[] byteArray11 = dynamicChannelBuffer1.array();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        dynamicChannelBuffer6.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int15 = dynamicChannelBuffer14.writableBytes();
        java.nio.ByteBuffer byteBuffer16 = dynamicChannelBuffer14.toByteBuffer();
        dynamicChannelBuffer6.getBytes((int) (byte) 1, byteBuffer16);
        dynamicChannelBuffer6.writeZero(0);
        double double21 = dynamicChannelBuffer6.getDouble(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        dynamicChannelBuffer1.writeDouble((double) 100.0f);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4217088 + "'", int11 == 4217088);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        dynamicChannelBuffer13.writeByte((int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        byte[] byteArray27 = new byte[] {};
        dynamicChannelBuffer22.readBytes(byteArray27);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder31 = null;
        int int32 = dynamicChannelBuffer22.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder31);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int35 = dynamicChannelBuffer34.writableBytes();
        java.nio.ByteBuffer byteBuffer36 = dynamicChannelBuffer34.toByteBuffer();
        dynamicChannelBuffer22.readBytes(byteBuffer36);
        dynamicChannelBuffer13.setBytes(100, byteBuffer36);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray42 = dynamicChannelBuffer41.array();
        dynamicChannelBuffer13.getBytes(0, byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = dynamicChannelBuffer13.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 0, 0, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.clear();
        boolean boolean16 = dynamicChannelBuffer13.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray17 = dynamicChannelBuffer13.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteBufferArray17);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        boolean boolean8 = dynamicChannelBuffer1.readable();
        long long9 = dynamicChannelBuffer1.readLong();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int12 = dynamicChannelBuffer11.writableBytes();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer11.ensureWritableBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray21 = dynamicChannelBuffer20.array();
        dynamicChannelBuffer20.resetWriterIndex();
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer20.toString(charset23);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int27 = dynamicChannelBuffer26.writableBytes();
        java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer26.toByteBuffer();
        dynamicChannelBuffer20.writeBytes(byteBuffer28);
        int int30 = dynamicChannelBuffer11.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        dynamicChannelBuffer20.writeBoolean(true);
        boolean boolean33 = dynamicChannelBuffer1.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeFloat((float) 2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int9 = dynamicChannelBuffer8.writableBytes();
        java.nio.ByteBuffer byteBuffer10 = dynamicChannelBuffer8.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int14 = dynamicChannelBuffer13.writableBytes();
        boolean boolean16 = dynamicChannelBuffer13.getBoolean((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray19 = dynamicChannelBuffer18.array();
        dynamicChannelBuffer13.writeBytes(byteArray19);
        dynamicChannelBuffer8.setBytes((int) (short) 0, byteArray19, (int) '4', 10);
        dynamicChannelBuffer1.writeBytes(byteArray19);
        short short25 = dynamicChannelBuffer1.readShort();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 16384 + "'", short25 == (short) 16384);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        dynamicChannelBuffer1.setByte((int) '#', (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int12 = dynamicChannelBuffer11.writableBytes();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer11.ensureWritableBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray21 = dynamicChannelBuffer20.array();
        dynamicChannelBuffer20.resetWriterIndex();
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer20.toString(charset23);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int27 = dynamicChannelBuffer26.writableBytes();
        java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer26.toByteBuffer();
        dynamicChannelBuffer20.writeBytes(byteBuffer28);
        int int30 = dynamicChannelBuffer11.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        byte[] byteArray31 = dynamicChannelBuffer20.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        dynamicChannelBuffer1.setDouble((int) '#', (double) (byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer1.factory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        dynamicChannelBuffer10.writeLong((long) 100);
        dynamicChannelBuffer10.writeShort((int) (short) 1);
        int int24 = dynamicChannelBuffer10.arrayOffset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        java.lang.String str6 = dynamicChannelBuffer1.toString();
        dynamicChannelBuffer1.setByte((int) '#', (int) (short) 100);
        dynamicChannelBuffer1.writerIndex((int) (short) 100);
        float float12 = dynamicChannelBuffer1.readFloat();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str6, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        int int6 = dynamicChannelBuffer1.arrayOffset();
        int int7 = dynamicChannelBuffer1.arrayOffset();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray10 = dynamicChannelBuffer9.array();
        dynamicChannelBuffer9.resetWriterIndex();
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.writeFloat((float) 2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int17 = dynamicChannelBuffer16.writableBytes();
        java.nio.ByteBuffer byteBuffer18 = dynamicChannelBuffer16.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int22 = dynamicChannelBuffer21.writableBytes();
        boolean boolean24 = dynamicChannelBuffer21.getBoolean((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray27 = dynamicChannelBuffer26.array();
        dynamicChannelBuffer21.writeBytes(byteArray27);
        dynamicChannelBuffer16.setBytes((int) (short) 0, byteArray27, (int) '4', 10);
        dynamicChannelBuffer9.writeBytes(byteArray27);
        double double34 = dynamicChannelBuffer9.getDouble(5);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, 2, (int) '\000');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer1.factory();
        int int5 = dynamicChannelBuffer1.readerIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        dynamicChannelBuffer1.setInt((int) '\000', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex(167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int8 = dynamicChannelBuffer7.writableBytes();
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.writeBytes(byteBuffer9);
        short short12 = dynamicChannelBuffer1.getUnsignedByte(0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        dynamicChannelBuffer10.writeLong((long) 100);
        int int22 = dynamicChannelBuffer10.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int25 = dynamicChannelBuffer24.writableBytes();
        dynamicChannelBuffer24.clear();
        dynamicChannelBuffer24.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer24.ensureWritableBytes((int) (byte) 0);
        dynamicChannelBuffer10.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer35 = dynamicChannelBuffer10.readBytes(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int6 = dynamicChannelBuffer5.writableBytes();
        dynamicChannelBuffer5.clear();
        dynamicChannelBuffer5.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer5.ensureWritableBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray15 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer14.resetWriterIndex();
        java.nio.charset.Charset charset17 = null;
        java.lang.String str18 = dynamicChannelBuffer14.toString(charset17);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int21 = dynamicChannelBuffer20.writableBytes();
        java.nio.ByteBuffer byteBuffer22 = dynamicChannelBuffer20.toByteBuffer();
        dynamicChannelBuffer14.writeBytes(byteBuffer22);
        int int24 = dynamicChannelBuffer5.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        byte[] byteArray25 = dynamicChannelBuffer14.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray25, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        int int16 = dynamicChannelBuffer13.readerIndex();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        dynamicChannelBuffer6.writeMedium(65280);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        dynamicChannelBuffer1.setInt((int) '\000', (int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray25 = dynamicChannelBuffer24.array();
        boolean boolean26 = dynamicChannelBuffer1.equals((java.lang.Object) byteArray25);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer29.writeInt(10);
        dynamicChannelBuffer29.clear();
        java.nio.ByteOrder byteOrder33 = dynamicChannelBuffer29.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer36.writeInt(10);
        dynamicChannelBuffer36.clear();
        java.nio.ByteOrder byteOrder40 = dynamicChannelBuffer36.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int44 = dynamicChannelBuffer43.writableBytes();
        dynamicChannelBuffer43.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory46 = dynamicChannelBuffer43.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder40, (int) (byte) 100, channelBufferFactory46);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray51 = dynamicChannelBuffer50.array();
        dynamicChannelBuffer50.resetWriterIndex();
        dynamicChannelBuffer50.markWriterIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer50.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder40, (int) (byte) 100, channelBufferFactory54);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder33, 2, channelBufferFactory54);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer58 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int59 = dynamicChannelBuffer58.writableBytes();
        dynamicChannelBuffer58.clear();
        dynamicChannelBuffer58.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer58.ensureWritableBytes((int) (byte) 0);
        dynamicChannelBuffer58.writeFloat(0.0f);
        dynamicChannelBuffer56.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer58, 4);
        dynamicChannelBuffer1.setBytes((int) (byte) 100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer58);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory46);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBufferFactory54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.duplicate();
        double double5 = dynamicChannelBuffer1.getDouble((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        java.nio.ByteBuffer byteBuffer3 = dynamicChannelBuffer1.toByteBuffer();
        float float5 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setByte(3, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        char char32 = dynamicChannelBuffer22.getChar((int) '4');
        dynamicChannelBuffer22.writeInt((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int41 = dynamicChannelBuffer40.writableBytes();
        dynamicChannelBuffer37.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, (int) ' ');
        dynamicChannelBuffer40.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray48 = dynamicChannelBuffer47.array();
        dynamicChannelBuffer47.setIndex(10, (int) (short) 100);
        byte[] byteArray52 = new byte[] {};
        dynamicChannelBuffer47.readBytes(byteArray52);
        boolean boolean54 = dynamicChannelBuffer47.readable();
        int int55 = dynamicChannelBuffer47.writableBytes();
        dynamicChannelBuffer40.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47, (int) (byte) 1);
        dynamicChannelBuffer22.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, 0, (int) (byte) 10);
        java.nio.ByteBuffer byteBuffer61 = dynamicChannelBuffer40.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer63 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer63.writeInt(10);
        int int66 = dynamicChannelBuffer63.readerIndex();
        char char67 = dynamicChannelBuffer63.readChar();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer70 = dynamicChannelBuffer63.slice(10, (int) (short) 10);
        dynamicChannelBuffer40.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer63);
        dynamicChannelBuffer40.writeFloat((float) '#');
        java.nio.ByteBuffer byteBuffer74 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer40.writeBytes(byteBuffer74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + char67 + "' != '" + '\000' + "'", char67 == '\000');
        org.junit.Assert.assertNotNull(channelBuffer70);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer1.factory();
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer8.writeInt(10);
        int int11 = dynamicChannelBuffer8.readerIndex();
        char char12 = dynamicChannelBuffer8.readChar();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer8.slice(10, (int) (short) 10);
        dynamicChannelBuffer1.setBytes(4, channelBuffer15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNotNull(channelBuffer15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            char char4 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        byte[] byteArray31 = dynamicChannelBuffer1.array();
        int int33 = dynamicChannelBuffer1.getUnsignedShort((int) '\000');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int7 = dynamicChannelBuffer6.writableBytes();
        boolean boolean8 = dynamicChannelBuffer6.isDirect();
        dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 1);
        dynamicChannelBuffer1.setDouble((int) '#', (double) (byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.slice();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(channelBuffer15);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        short short6 = dynamicChannelBuffer1.readShort();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.readBytes(2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray11 = dynamicChannelBuffer10.array();
        dynamicChannelBuffer1.writeBytes(byteArray11);
        java.lang.String str13 = dynamicChannelBuffer1.toString();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer1.slice();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DynamicChannelBuffer(ridx=14, widx=200, cap=200)" + "'", str13, "DynamicChannelBuffer(ridx=14, widx=200, cap=200)");
        org.junit.Assert.assertNotNull(channelBuffer14);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString(charset4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int8 = dynamicChannelBuffer7.writableBytes();
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.writeBytes(byteBuffer9);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int19 = dynamicChannelBuffer18.writableBytes();
        boolean boolean20 = dynamicChannelBuffer18.isDirect();
        dynamicChannelBuffer13.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18, 1);
        dynamicChannelBuffer18.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray26 = dynamicChannelBuffer25.array();
        boolean boolean27 = dynamicChannelBuffer25.writable();
        java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer25.toByteBuffer();
        byte[] byteArray30 = new byte[] {};
        dynamicChannelBuffer25.setBytes(2, byteArray30);
        dynamicChannelBuffer18.readBytes(byteArray30);
        dynamicChannelBuffer1.getBytes(4, byteArray30);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.setIndex(10, (int) (short) 100);
        java.lang.String str10 = dynamicChannelBuffer5.toString();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) (byte) 1);
        dynamicChannelBuffer1.discardReadBytes();
        byte byte17 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str10, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer13.writeInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray18 = dynamicChannelBuffer17.array();
        dynamicChannelBuffer17.setIndex(10, (int) (short) 100);
        java.lang.String str22 = dynamicChannelBuffer17.toString();
        dynamicChannelBuffer13.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        dynamicChannelBuffer1.writeInt(167772160);
        boolean boolean27 = dynamicChannelBuffer1.isDirect();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, 0, 0, 0, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DynamicChannelBuffer(ridx=10, widx=100, cap=100)" + "'", str22, "DynamicChannelBuffer(ridx=10, widx=100, cap=100)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.setIndex(10, (int) (short) 100);
        byte[] byteArray6 = new byte[] {};
        dynamicChannelBuffer1.readBytes(byteArray6);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        int int11 = dynamicChannelBuffer1.bytesBefore((int) '#', (int) (byte) 0, channelBufferIndexFinder10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int14 = dynamicChannelBuffer13.writableBytes();
        java.nio.ByteBuffer byteBuffer15 = dynamicChannelBuffer13.toByteBuffer();
        dynamicChannelBuffer1.readBytes(byteBuffer15);
        dynamicChannelBuffer1.markReaderIndex();
        int int18 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer1.slice();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 90 + "'", int18 == 90);
        org.junit.Assert.assertNotNull(channelBuffer19);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        boolean boolean4 = dynamicChannelBuffer1.getBoolean((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer6.clear();
        dynamicChannelBuffer6.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int12 = dynamicChannelBuffer11.writableBytes();
        boolean boolean13 = dynamicChannelBuffer11.isDirect();
        dynamicChannelBuffer6.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 1);
        java.nio.ByteBuffer byteBuffer16 = dynamicChannelBuffer6.toByteBuffer();
        int int17 = dynamicChannelBuffer6.readableBytes();
        boolean boolean18 = dynamicChannelBuffer1.equals((java.lang.Object) dynamicChannelBuffer6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        int int4 = dynamicChannelBuffer1.readerIndex();
        char char5 = dynamicChannelBuffer1.readChar();
        byte byte6 = dynamicChannelBuffer1.readByte();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int2 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer1.setShort(3, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(1079525376);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.readBytes((int) (short) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray33 = dynamicChannelBuffer32.array();
        boolean boolean34 = dynamicChannelBuffer32.writable();
        java.nio.ByteBuffer byteBuffer35 = dynamicChannelBuffer32.toByteBuffer();
        dynamicChannelBuffer22.writeBytes(byteBuffer35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(byteBuffer35);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        dynamicChannelBuffer1.clear();
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int9 = dynamicChannelBuffer8.writableBytes();
        dynamicChannelBuffer8.clear();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer8.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder5, (int) (byte) 100, channelBufferFactory11);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray16 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.resetWriterIndex();
        dynamicChannelBuffer15.markWriterIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer15.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder5, (int) (byte) 100, channelBufferFactory19);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int23 = dynamicChannelBuffer22.writableBytes();
        dynamicChannelBuffer22.clear();
        dynamicChannelBuffer22.setByte((int) '#', (int) (byte) 10);
        dynamicChannelBuffer22.ensureWritableBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray32 = dynamicChannelBuffer31.array();
        dynamicChannelBuffer31.resetWriterIndex();
        java.nio.charset.Charset charset34 = null;
        java.lang.String str35 = dynamicChannelBuffer31.toString(charset34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int38 = dynamicChannelBuffer37.writableBytes();
        java.nio.ByteBuffer byteBuffer39 = dynamicChannelBuffer37.toByteBuffer();
        dynamicChannelBuffer31.writeBytes(byteBuffer39);
        int int41 = dynamicChannelBuffer22.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer31);
        dynamicChannelBuffer22.writeMedium(10);
        int int45 = dynamicChannelBuffer22.bytesBefore((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer20.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        boolean boolean10 = dynamicChannelBuffer8.writable();
        int int11 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        int int12 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.writeChar((-1));
        int int16 = dynamicChannelBuffer1.getUnsignedShort(3);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer1.bytesBefore((int) (short) 16384, (int) '#', (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 35, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 65280 + "'", int16 == 65280);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.markWriterIndex();
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.readSlice((int) (byte) 0);
        dynamicChannelBuffer1.writeDouble((double) 0.0f);
        dynamicChannelBuffer1.setFloat((int) (byte) 1, (float) 100);
        dynamicChannelBuffer1.writeLong((long) 167772160);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 66, -56, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeZero((int) (short) 10);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray8 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.resetWriterIndex();
        dynamicChannelBuffer7.markWriterIndex();
        dynamicChannelBuffer7.discardReadBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer7.readSlice((int) (byte) 0);
        dynamicChannelBuffer1.readBytes(channelBuffer13);
        int int15 = dynamicChannelBuffer1.arrayOffset();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (byte) 10, (int) '#', (int) (short) 35, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.clear();
        boolean boolean4 = dynamicChannelBuffer1.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.setByte(0, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.clear();
        boolean boolean13 = dynamicChannelBuffer10.equals((java.lang.Object) false);
        java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer10.toByteBuffers();
        boolean boolean16 = dynamicChannelBuffer10.getBoolean((int) (short) 10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray23 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.setIndex(10, (int) (short) 100);
        short short27 = dynamicChannelBuffer22.readShort();
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) ' ', 1);
        char char32 = dynamicChannelBuffer22.getChar((int) '4');
        dynamicChannelBuffer22.writeInt((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int41 = dynamicChannelBuffer40.writableBytes();
        dynamicChannelBuffer37.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, (int) ' ');
        dynamicChannelBuffer40.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray48 = dynamicChannelBuffer47.array();
        dynamicChannelBuffer47.setIndex(10, (int) (short) 100);
        byte[] byteArray52 = new byte[] {};
        dynamicChannelBuffer47.readBytes(byteArray52);
        boolean boolean54 = dynamicChannelBuffer47.readable();
        int int55 = dynamicChannelBuffer47.writableBytes();
        dynamicChannelBuffer40.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47, (int) (byte) 1);
        dynamicChannelBuffer22.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, 0, (int) (byte) 10);
        java.nio.ByteBuffer byteBuffer61 = dynamicChannelBuffer40.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer63 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer63.writeInt(10);
        int int66 = dynamicChannelBuffer63.readerIndex();
        char char67 = dynamicChannelBuffer63.readChar();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer70 = dynamicChannelBuffer63.slice(10, (int) (short) 10);
        dynamicChannelBuffer40.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer63);
        dynamicChannelBuffer40.writeFloat((float) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer76 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        byte[] byteArray77 = dynamicChannelBuffer76.array();
        dynamicChannelBuffer40.setBytes(0, byteArray77, 0, 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(byteBuffer61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + char67 + "' != '" + '\000' + "'", char67 == '\000');
        org.junit.Assert.assertNotNull(channelBuffer70);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeInt(10);
        dynamicChannelBuffer1.clear();
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer8.clear();
        dynamicChannelBuffer8.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int14 = dynamicChannelBuffer13.writableBytes();
        boolean boolean15 = dynamicChannelBuffer13.isDirect();
        dynamicChannelBuffer8.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, 1);
        dynamicChannelBuffer8.setDouble((int) '#', (double) (byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer8.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder5, 1079525376, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        int int25 = dynamicChannelBuffer24.writableBytes();
        boolean boolean27 = dynamicChannelBuffer24.getBoolean((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24, (int) (byte) 10, (int) (short) 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) '4', 0, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
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
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) (short) 0, 0, (int) (byte) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 0, (int) '4', (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) 10, 1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 100);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) ' ', (int) '#', (int) 'a', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', (int) (byte) 0, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (short) -1, (int) (short) -1, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) '4', 100, (int) '#', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (-1), (int) 'a', (int) (byte) 1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 0, (int) ' ', (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) '4', (int) (short) 100, (int) (byte) -1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (byte) 10, 0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) '4', (int) (byte) 10, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) -1, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 0, (int) (short) 1, 100, (int) (byte) 100, true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (byte) 100, (int) (byte) 1, 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) ' ', channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(1);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 1, (int) (short) 1, (-1), 100, true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) -1, 1, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) 0, 1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 1, (int) ' ', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
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
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) 'a');
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (int) (byte) 10, (int) 'a', (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (byte) 0, (int) (byte) 10, (int) '4', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (-1), channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 100, (int) (byte) 1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (35) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) 100, (int) (short) 1, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (100) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) '4', (int) (short) 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 100, 0, 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) 'a', 1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
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
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 0, 100, (int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) 'a', (int) (short) 10, (int) (short) -1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) '4', (int) (byte) -1, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 0, 0, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (short) 100, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
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
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) '4', 10, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '#', (int) (byte) 10, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) 10, (int) 'a', (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (-1), (int) (byte) 1, (int) (byte) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 100, (int) (short) -1, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (-1), (int) (byte) 10, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 1, (int) '4', (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) -1, 0, (int) (byte) 10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 0, 10, (int) (byte) 0, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) -1, (int) 'a', (int) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 1, 10, (int) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 1, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 1, 1, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (byte) 0, (int) (byte) 1, 10, (int) (byte) 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 10, (int) (short) 1, 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (10) must be equal to or greater than lengthFieldOffset (10) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (short) 1, (int) (byte) 1, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 10, (int) (byte) 0, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 1, (int) (byte) 0, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (byte) -1, (int) (byte) 100, (int) (short) 100, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) 1, (int) (byte) 10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (byte) 100, 100, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 1);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 0, 0, (int) (short) -1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, (int) (byte) -1, (int) ' ', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) -1, (int) (short) 1, (-1), (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (short) 0, (int) (short) 10, (int) (byte) 100, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(100);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) ' ', 1, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) -1, (int) 'a', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) -1, (int) ' ', 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

