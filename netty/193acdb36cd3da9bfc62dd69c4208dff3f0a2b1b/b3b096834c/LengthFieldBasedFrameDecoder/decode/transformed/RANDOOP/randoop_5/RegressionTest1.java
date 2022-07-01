import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.getUnsignedShort((int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2815");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) "");
        dynamicChannelBuffer1.writeLong(100L);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (short) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.setShort(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setByte((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer16.clear();
        dynamicChannelBuffer16.writeLong((long) 0);
        dynamicChannelBuffer16.writeDouble((double) (short) -1);
        float float24 = dynamicChannelBuffer16.readFloat();
        dynamicChannelBuffer16.setZero(5, 5);
        float float28 = dynamicChannelBuffer16.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer30.resetReaderIndex();
        byte[] byteArray32 = dynamicChannelBuffer30.array();
        dynamicChannelBuffer30.clear();
        dynamicChannelBuffer30.writeLong((long) 0);
        dynamicChannelBuffer30.writeDouble((double) (short) -1);
        int int38 = dynamicChannelBuffer30.readerIndex();
        byte byte39 = dynamicChannelBuffer30.readByte();
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30, 4);
        int int42 = dynamicChannelBuffer16.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int45 = dynamicChannelBuffer44.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder47 = null;
        int int48 = dynamicChannelBuffer44.bytesBefore((int) '\000', channelBufferIndexFinder47);
        byte[] byteArray49 = dynamicChannelBuffer44.array();
        dynamicChannelBuffer16.writeBytes(byteArray49);
        dynamicChannelBuffer1.readBytes(byteArray49);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = dynamicChannelBuffer1.getMedium((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100]");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        short short10 = dynamicChannelBuffer1.getUnsignedByte((int) (short) 1);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.factory;
        char char12 = dynamicChannelBuffer1.readChar();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex(720740);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        dynamicChannelBuffer1.setLong(5, 1L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer18.resetReaderIndex();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer18.writeBytes(byteArray26);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory28 = dynamicChannelBuffer18.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory29 = dynamicChannelBuffer18.factory();
        boolean boolean31 = dynamicChannelBuffer18.equals((java.lang.Object) "");
        dynamicChannelBuffer18.writeLong(100L);
        dynamicChannelBuffer18.resetWriterIndex();
        dynamicChannelBuffer18.setBoolean((int) (byte) 10, false);
        dynamicChannelBuffer18.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18, (-256));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory28);
        org.junit.Assert.assertNotNull(channelBufferFactory29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.writeShort(4);
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.bytesBefore((int) 'a', (int) '\u0aff', channelBufferIndexFinder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
            short short17 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        char char15 = dynamicChannelBuffer1.readChar();
        boolean boolean16 = dynamicChannelBuffer1.writable();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.discardReadBytes();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer9);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset24 = null;
        java.lang.String str25 = dynamicChannelBuffer21.toString((int) (short) 1, (int) (short) 0, charset24);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer21.factory;
        int int27 = dynamicChannelBuffer21.readerIndex();
        int int28 = dynamicChannelBuffer21.readerIndex();
        dynamicChannelBuffer21.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset34 = null;
        java.lang.String str35 = dynamicChannelBuffer31.toString((int) (short) 1, (int) (short) 0, charset34);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory;
        dynamicChannelBuffer31.writeShort(4);
        java.nio.ByteBuffer byteBuffer39 = dynamicChannelBuffer31.toByteBuffer();
        dynamicChannelBuffer21.writeBytes(byteBuffer39);
        dynamicChannelBuffer1.readBytes(byteBuffer39);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer43.resetReaderIndex();
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer43.writeBytes(byteArray51);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory53 = dynamicChannelBuffer43.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer43.factory();
        boolean boolean56 = dynamicChannelBuffer43.equals((java.lang.Object) "");
        dynamicChannelBuffer43.writeLong(100L);
        dynamicChannelBuffer43.resetWriterIndex();
        dynamicChannelBuffer43.setBoolean((int) (byte) 10, false);
        dynamicChannelBuffer43.ensureWritableBytes((int) 'a');
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer43, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long67 = dynamicChannelBuffer43.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory53);
        org.junit.Assert.assertNotNull(channelBufferFactory54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        dynamicChannelBuffer1.discardReadBytes();
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.resetReaderIndex();
        byte[] byteArray11 = dynamicChannelBuffer9.array();
        dynamicChannelBuffer9.clear();
        dynamicChannelBuffer9.writeLong((long) 0);
        byte byte16 = dynamicChannelBuffer9.getByte(0);
        dynamicChannelBuffer9.writeFloat((float) 1L);
        dynamicChannelBuffer9.setShort((int) (short) 0, (int) (byte) 1);
        int int24 = dynamicChannelBuffer9.bytesBefore(5, (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = dynamicChannelBuffer9.readSlice(10);
        dynamicChannelBuffer1.buffer = channelBuffer26;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(channelBuffer26);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        int int7 = dynamicChannelBuffer5.bytesBefore((byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setMedium((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.writeFloat((float) '\000');
        dynamicChannelBuffer1.writeInt((int) (short) -1);
        int int6 = dynamicChannelBuffer1.readUnsignedShort();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.writeFloat((float) '\000');
        dynamicChannelBuffer1.writeInt((int) (short) -1);
        byte byte6 = dynamicChannelBuffer1.readByte();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 2815, outputStream8, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        java.nio.ByteBuffer[] byteBufferArray12 = dynamicChannelBuffer1.toByteBuffers((int) (short) 0, 0);
        int int13 = dynamicChannelBuffer1.readUnsignedShort();
        java.nio.channels.GatheringByteChannel gatheringByteChannel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer1.getBytes((int) (short) 2815, gatheringByteChannel15, (int) '\u4024');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBufferArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray15);
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
        int int44 = dynamicChannelBuffer18.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int47 = dynamicChannelBuffer46.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder49 = null;
        int int50 = dynamicChannelBuffer46.bytesBefore((int) '\000', channelBufferIndexFinder49);
        byte[] byteArray51 = dynamicChannelBuffer46.array();
        dynamicChannelBuffer18.writeBytes(byteArray51);
        dynamicChannelBuffer1.readBytes(byteArray51);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 0 + "'", byte41 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelHandler channelHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext5 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=0, widx=4, cap=4)", channelHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        dynamicChannelBuffer1.readerIndex(4);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        int int4 = dynamicChannelBuffer1.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = dynamicChannelBuffer1.getDouble(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.factory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer5.factory;
        boolean boolean13 = dynamicChannelBuffer5.isDirect();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.writeFloat((float) '\000');
        dynamicChannelBuffer1.writeInt((int) (short) -1);
        byte byte6 = dynamicChannelBuffer1.readByte();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer1.toByteBuffer((int) (byte) 0, (int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        int int5 = dynamicChannelBuffer1.bytesBefore((int) '\000', channelBufferIndexFinder4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer8.writeBytes(byteArray16);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer8.getfactory();
        dynamicChannelBuffer8.writeBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(16, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory18);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory7 = dynamicChannelBuffer1.factory();
        dynamicChannelBuffer1.writeByte(8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(channelBufferFactory7);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        int int7 = dynamicChannelBuffer5.bytesBefore((byte) -1);
        dynamicChannelBuffer5.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer5.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        int int20 = dynamicChannelBuffer1.readerIndex();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer1.order();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer1.slice();
        java.nio.charset.Charset charset17 = null;
        java.lang.String str18 = dynamicChannelBuffer1.toString(256, 0, charset17);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset24 = null;
        java.lang.String str25 = dynamicChannelBuffer21.toString((int) (short) 1, (int) (short) 0, charset24);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer21.factory;
        int int27 = dynamicChannelBuffer21.readerIndex();
        int int28 = dynamicChannelBuffer21.readerIndex();
        dynamicChannelBuffer21.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset34 = null;
        java.lang.String str35 = dynamicChannelBuffer31.toString((int) (short) 1, (int) (short) 0, charset34);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory;
        dynamicChannelBuffer31.writeShort(4);
        java.nio.ByteBuffer byteBuffer39 = dynamicChannelBuffer31.toByteBuffer();
        dynamicChannelBuffer21.writeBytes(byteBuffer39);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '4', byteBuffer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(byteBuffer39);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        // The following exception was thrown during execution in test generation
        try {
            short short16 = dynamicChannelBuffer4.readUnsignedByte();
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
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(7, 0, (int) (short) 10, 65536, (int) '\u640a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt(5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int30 = dynamicChannelBuffer29.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder32 = null;
        int int33 = dynamicChannelBuffer29.bytesBefore((int) '\000', channelBufferIndexFinder32);
        byte[] byteArray34 = dynamicChannelBuffer29.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.setBytes((int) (short) 2815, byteArray34, 6, (int) (short) 2815);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        dynamicChannelBuffer1.setLong(5, 1L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer17.writeBytes(byteArray25);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer17.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory28 = dynamicChannelBuffer17.factory();
        boolean boolean30 = dynamicChannelBuffer17.equals((java.lang.Object) "");
        int int31 = dynamicChannelBuffer17.writerIndex();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 2);
        dynamicChannelBuffer17.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int37 = dynamicChannelBuffer36.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder39 = null;
        int int40 = dynamicChannelBuffer36.bytesBefore((int) '\000', channelBufferIndexFinder39);
        byte[] byteArray41 = dynamicChannelBuffer36.array();
        int int42 = dynamicChannelBuffer17.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer36);
        boolean boolean43 = dynamicChannelBuffer36.isDirect();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory27);
        org.junit.Assert.assertNotNull(channelBufferFactory28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer1.getendianness();
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteOrder17);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.getbuffer();
        boolean boolean14 = dynamicChannelBuffer1.readable();
        int int18 = dynamicChannelBuffer1.indexOf(65536, (int) '\u0aff', (byte) 1);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer1.bytesBefore(4, channelBufferIndexFinder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        // The following exception was thrown during execution in test generation
        try {
            float float25 = dynamicChannelBuffer1.getFloat(65536);
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
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.setDouble(8, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1076101120 + "'", int30 == 1076101120);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        short short49 = dynamicChannelBuffer1.readShort();
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
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 0 + "'", short49 == (short) 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        boolean boolean12 = dynamicChannelBuffer5.writable();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        dynamicChannelBuffer12.writeMedium(720740);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        byte[] byteArray16 = dynamicChannelBuffer1.array();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 1, 0, 0, 0, 0, 0, 0, 63, -128, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        int int12 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer14.writeBytes(byteArray22);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer14.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer14.factory();
        boolean boolean27 = dynamicChannelBuffer14.equals((java.lang.Object) "");
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer14.buffer;
        short short29 = dynamicChannelBuffer14.readShort();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, (int) (short) 100, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 2815 + "'", short29 == (short) 2815);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        int int9 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.setLong((int) (short) 0, (long) 1076101120);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer1.getendianness();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(byteOrder13);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        dynamicChannelBuffer15.writeLong((long) 256);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1076101120 + "'", int30 == 1076101120);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer1.writeDouble((double) 10.0f);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray15 = dynamicChannelBuffer1.toByteBuffers(1076101120, (int) '\u640a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(byteOrder12);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        int int9 = dynamicChannelBuffer1.readerIndex();
        byte byte10 = dynamicChannelBuffer1.readByte();
        java.nio.channels.GatheringByteChannel gatheringByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.getBytes((int) ' ', gatheringByteChannel12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        int int7 = dynamicChannelBuffer5.bytesBefore((byte) -1);
        dynamicChannelBuffer5.markWriterIndex();
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer5.toString(charset9);
        // The following exception was thrown during execution in test generation
        try {
            short short12 = dynamicChannelBuffer5.getUnsignedByte((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) "");
        dynamicChannelBuffer1.writeLong(100L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer19.resetReaderIndex();
        byte[] byteArray21 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer19.clear();
        dynamicChannelBuffer19.writeLong((long) 0);
        byte byte26 = dynamicChannelBuffer19.getByte(0);
        dynamicChannelBuffer19.writeFloat((float) 1L);
        dynamicChannelBuffer19.ensureWritableBytes((int) 'a');
        boolean boolean31 = dynamicChannelBuffer19.readable();
        dynamicChannelBuffer19.writeBoolean(true);
        dynamicChannelBuffer19.setDouble(0, 10.0d);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer37 = dynamicChannelBuffer19.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset42 = null;
        java.lang.String str43 = dynamicChannelBuffer39.toString((int) (short) 1, (int) (short) 0, charset42);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory44 = dynamicChannelBuffer39.factory;
        int int45 = dynamicChannelBuffer39.readerIndex();
        int int46 = dynamicChannelBuffer39.readerIndex();
        dynamicChannelBuffer39.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset52 = null;
        java.lang.String str53 = dynamicChannelBuffer49.toString((int) (short) 1, (int) (short) 0, charset52);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer49.factory;
        dynamicChannelBuffer49.writeShort(4);
        java.nio.ByteBuffer byteBuffer57 = dynamicChannelBuffer49.toByteBuffer();
        dynamicChannelBuffer39.writeBytes(byteBuffer57);
        dynamicChannelBuffer19.readBytes(byteBuffer57);
        dynamicChannelBuffer1.getBytes((int) (short) 1, byteBuffer57);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean((int) '\u0aff', false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2815");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(channelBuffer37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(channelBufferFactory44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(channelBufferFactory54);
        org.junit.Assert.assertNotNull(byteBuffer57);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        float float16 = dynamicChannelBuffer1.getFloat((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-3.0311793E38f) + "'", float16 == (-3.0311793E38f));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        int int9 = dynamicChannelBuffer1.arrayOffset();
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = dynamicChannelBuffer12.toString((int) (short) 1, (int) (short) 0, charset15);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory17 = dynamicChannelBuffer12.factory;
        int int18 = dynamicChannelBuffer12.readerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer12.buffer;
        boolean boolean20 = dynamicChannelBuffer1.equals((java.lang.Object) channelBuffer19);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(channelBufferFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dynamicChannelBuffer1.toString(charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(6, 1076101120, 4, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (6) must be equal to or greater than lengthFieldOffset (1076101120) + lengthFieldLength (4).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer6.bytesBefore((int) (short) 10, channelBufferIndexFinder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer1.writeDouble((double) 10.0f);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) ' ', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(byteOrder12);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        int int7 = dynamicChannelBuffer5.bytesBefore((byte) -1);
        dynamicChannelBuffer5.markWriterIndex();
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer5.toString(charset9);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = dynamicChannelBuffer5.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        int int10 = dynamicChannelBuffer8.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer8.getMedium(65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 65536");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        int int15 = dynamicChannelBuffer1.indexOf((int) (byte) 100, (int) (byte) 1, (byte) 100);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 2815, outputStream17, 5);
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
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.setMedium((int) '\000', (int) (short) -1);
        int int12 = dynamicChannelBuffer1.arrayOffset();
        java.nio.channels.GatheringByteChannel gatheringByteChannel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.getBytes((int) (byte) 10, gatheringByteChannel14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.getbuffer();
        boolean boolean14 = dynamicChannelBuffer1.readable();
        int int18 = dynamicChannelBuffer1.indexOf(65536, (int) '\u0aff', (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer21.writeFloat((float) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer25.toString((int) (short) 1, (int) (short) 0, charset28);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer25.factory;
        int int31 = dynamicChannelBuffer25.readerIndex();
        int int32 = dynamicChannelBuffer25.readerIndex();
        dynamicChannelBuffer25.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset38 = null;
        java.lang.String str39 = dynamicChannelBuffer35.toString((int) (short) 1, (int) (short) 0, charset38);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory40 = dynamicChannelBuffer35.factory;
        dynamicChannelBuffer35.writeShort(4);
        java.nio.ByteBuffer byteBuffer43 = dynamicChannelBuffer35.toByteBuffer();
        dynamicChannelBuffer25.writeBytes(byteBuffer43);
        dynamicChannelBuffer21.readBytes(byteBuffer43);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 100, byteBuffer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(channelBufferFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(channelBufferFactory40);
        org.junit.Assert.assertNotNull(byteBuffer43);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        boolean boolean9 = dynamicChannelBuffer5.writable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.copy();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer5.toByteBuffer(1076101120, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset24 = null;
        java.lang.String str25 = dynamicChannelBuffer21.toString((int) (short) 1, (int) (short) 0, charset24);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer21.factory;
        int int27 = dynamicChannelBuffer21.readerIndex();
        int int28 = dynamicChannelBuffer21.readerIndex();
        dynamicChannelBuffer21.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset34 = null;
        java.lang.String str35 = dynamicChannelBuffer31.toString((int) (short) 1, (int) (short) 0, charset34);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory;
        dynamicChannelBuffer31.writeShort(4);
        java.nio.ByteBuffer byteBuffer39 = dynamicChannelBuffer31.toByteBuffer();
        dynamicChannelBuffer21.writeBytes(byteBuffer39);
        dynamicChannelBuffer1.readBytes(byteBuffer39);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer43.resetReaderIndex();
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer43.writeBytes(byteArray51);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory53 = dynamicChannelBuffer43.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer43.factory();
        boolean boolean56 = dynamicChannelBuffer43.equals((java.lang.Object) "");
        dynamicChannelBuffer43.writeLong(100L);
        dynamicChannelBuffer43.resetWriterIndex();
        dynamicChannelBuffer43.setBoolean((int) (byte) 10, false);
        dynamicChannelBuffer43.ensureWritableBytes((int) 'a');
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer43, 0);
        java.nio.channels.GatheringByteChannel gatheringByteChannel68 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int70 = dynamicChannelBuffer43.getBytes((int) (short) 2815, gatheringByteChannel68, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory53);
        org.junit.Assert.assertNotNull(channelBufferFactory54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        int int11 = dynamicChannelBuffer1.arrayOffset();
        java.nio.channels.GatheringByteChannel gatheringByteChannel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.getBytes((-4), gatheringByteChannel13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        int int7 = dynamicChannelBuffer5.bytesBefore((byte) -1);
        dynamicChannelBuffer5.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            byte byte10 = dynamicChannelBuffer5.getByte(1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1076101120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
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
            long long17 = dynamicChannelBuffer1.getLong((int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            char char11 = dynamicChannelBuffer1.getChar(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        java.lang.Class<?> wildcardClass19 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        dynamicChannelBuffer6.markReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer6.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', byteArray15, (int) 'a', (int) '#');
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
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
        java.nio.channels.GatheringByteChannel gatheringByteChannel29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = dynamicChannelBuffer20.readBytes(gatheringByteChannel29, (int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
        boolean boolean23 = dynamicChannelBuffer1.isDirect();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer1.duplicate();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(channelBuffer23);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeFloat((float) ' ');
        int int7 = dynamicChannelBuffer1.readableBytes();
        boolean boolean8 = dynamicChannelBuffer1.readable();
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer5.factory();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.setShort(0, 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer16.clear();
        dynamicChannelBuffer16.writeLong((long) 0);
        int int22 = dynamicChannelBuffer16.readableBytes();
        dynamicChannelBuffer16.setBoolean((int) (byte) 0, false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int29 = dynamicChannelBuffer28.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder31 = null;
        int int32 = dynamicChannelBuffer28.bytesBefore((int) '\000', channelBufferIndexFinder31);
        byte[] byteArray33 = dynamicChannelBuffer28.array();
        dynamicChannelBuffer16.getBytes(5, byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '\u0aff', byteArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0]");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        dynamicChannelBuffer1.discardReadBytes();
        // The following exception was thrown during execution in test generation
        try {
            char char7 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        boolean boolean22 = dynamicChannelBuffer1.writable();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer8.clear();
        dynamicChannelBuffer8.writeLong((long) 0);
        byte byte15 = dynamicChannelBuffer8.getByte(0);
        dynamicChannelBuffer8.writeFloat((float) 1L);
        dynamicChannelBuffer8.ensureWritableBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0, (-256));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer1.writeDouble((double) 10.0f);
        int int12 = dynamicChannelBuffer1.readerIndex();
        int int13 = dynamicChannelBuffer1.capacity();
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer5.writeMedium(7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) 'a');
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer((int) ' ', (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        dynamicChannelBuffer7.writeLong((long) 0);
        int int13 = dynamicChannelBuffer7.readableBytes();
        dynamicChannelBuffer7.setBoolean((int) (byte) 0, false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int20 = dynamicChannelBuffer19.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder22 = null;
        int int23 = dynamicChannelBuffer19.bytesBefore((int) '\000', channelBufferIndexFinder22);
        byte[] byteArray24 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer7.getBytes(5, byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '\000', byteArray24, (int) '4', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            short short3 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer19.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        byte[] byteArray27 = dynamicChannelBuffer25.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer29.resetReaderIndex();
        byte[] byteArray31 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer25.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer29.readSlice(0);
        boolean boolean35 = dynamicChannelBuffer29.writable();
        dynamicChannelBuffer29.writeInt((int) (byte) 100);
        long long38 = dynamicChannelBuffer29.readUnsignedInt();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer19.getBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
            dynamicChannelBuffer14.setBoolean((int) (short) 2815, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2815");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.readerIndex((int) '\000');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.writeFloat((float) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.clear();
        dynamicChannelBuffer5.writeLong((long) 0);
        byte byte12 = dynamicChannelBuffer5.getByte(0);
        dynamicChannelBuffer5.writeShort((int) (short) 10);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        dynamicChannelBuffer5.getBytes((int) (byte) 1, byteArray19);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer5;
        dynamicChannelBuffer5.resetReaderIndex();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0]");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = dynamicChannelBuffer1.getByte((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.writeBytes(inputStream12, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        dynamicChannelBuffer1.writeLong(100L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer41 = dynamicChannelBuffer1.toByteBuffer(10, 720740);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
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
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setZero(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteOrder15);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer14.clear();
        dynamicChannelBuffer14.writeLong((long) 0);
        char char20 = dynamicChannelBuffer14.readChar();
        int int22 = dynamicChannelBuffer14.getUnsignedMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        java.nio.charset.Charset charset24 = null;
        java.lang.String str25 = dynamicChannelBuffer14.toString(charset24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer28.markWriterIndex();
        dynamicChannelBuffer28.writeZero(65536);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer14.getBytes((-1), (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer28, 13, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeMedium(6);
        dynamicChannelBuffer1.discardReadBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.bytesBefore((int) '\u640a', (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray12 = dynamicChannelBuffer10.array();
        dynamicChannelBuffer10.clear();
        dynamicChannelBuffer10.writeLong((long) 0);
        char char16 = dynamicChannelBuffer10.readChar();
        int int18 = dynamicChannelBuffer10.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer20.toString((int) (short) 1, (int) (short) 0, charset23);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer25 = dynamicChannelBuffer20.getbuffer();
        dynamicChannelBuffer20.writeInt((int) (short) 100);
        boolean boolean28 = dynamicChannelBuffer20.readable();
        int int29 = dynamicChannelBuffer10.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        byte[] byteArray30 = dynamicChannelBuffer20.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(100, byteArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(channelBuffer25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 0, 0, 100]");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray25 = dynamicChannelBuffer23.array();
        dynamicChannelBuffer1.writeBytes(byteArray25);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        long long18 = dynamicChannelBuffer1.getUnsignedInt(4);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 6553600L + "'", long18 == 6553600L);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        short short11 = dynamicChannelBuffer1.readShort();
        java.nio.charset.Charset charset14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dynamicChannelBuffer1.toString((int) (byte) -1, (int) (byte) -1, charset14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
        int int21 = dynamicChannelBuffer19.bytesBefore((byte) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        java.nio.ByteBuffer[] byteBufferArray12 = dynamicChannelBuffer1.toByteBuffers((int) (short) 0, 0);
        int int13 = dynamicChannelBuffer1.readUnsignedShort();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel14, (int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBufferArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
        dynamicChannelBuffer17.markWriterIndex();
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
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(720740);
        dynamicChannelBuffer1.writerIndex((int) '4');
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder6 = null;
        int int7 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder6);
        int int9 = dynamicChannelBuffer1.bytesBefore((byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        int int9 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeZero((int) (short) 2815);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer24.resetReaderIndex();
        byte[] byteArray26 = dynamicChannelBuffer24.array();
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer24.readSlice(0);
        boolean boolean30 = dynamicChannelBuffer24.writable();
        dynamicChannelBuffer24.markWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer24.buffer;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 2815, channelBuffer32, 10, 256);
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
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(channelBuffer32);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
            int int14 = dynamicChannelBuffer1.getBytes(4, gatheringByteChannel12, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
        dynamicChannelBuffer1.writeFloat((float) (byte) 1);
        dynamicChannelBuffer1.writeFloat((float) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
        dynamicChannelBuffer1.setLong((int) (short) 1, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte byte26 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
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
        byte byte22 = dynamicChannelBuffer15.getByte(0);
        long long23 = dynamicChannelBuffer15.readUnsignedInt();
        int int24 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer15.writeLong((long) (short) 1);
        long long28 = dynamicChannelBuffer15.getUnsignedInt((int) (short) 1);
        int int29 = dynamicChannelBuffer15.readUnsignedMedium();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int33 = dynamicChannelBuffer32.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder35 = null;
        int int36 = dynamicChannelBuffer32.bytesBefore((int) '\000', channelBufferIndexFinder35);
        byte[] byteArray37 = dynamicChannelBuffer32.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.readBytes(byteArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0]");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.ensureWritableBytes(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer1.buffer;
        java.nio.channels.GatheringByteChannel gatheringByteChannel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.getBytes((int) (byte) 100, gatheringByteChannel13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer11);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        int int13 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder12);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer16.clear();
        dynamicChannelBuffer16.writeLong((long) 0);
        int int22 = dynamicChannelBuffer16.writerIndex();
        byte[] byteArray23 = dynamicChannelBuffer16.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((-256), byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        byte byte20 = dynamicChannelBuffer13.getByte(0);
        dynamicChannelBuffer13.writeFloat((float) 1L);
        dynamicChannelBuffer13.setShort((int) (short) 0, (int) (byte) 1);
        int int26 = dynamicChannelBuffer13.readUnsignedMedium();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer13.getfactory();
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer13.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer30.resetReaderIndex();
        byte[] byteArray32 = dynamicChannelBuffer30.array();
        dynamicChannelBuffer13.writeBytes(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '#', byteArray32, (-4), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 256 + "'", int26 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory27);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        int int9 = dynamicChannelBuffer1.readerIndex();
        short short11 = dynamicChannelBuffer1.getUnsignedByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.slice((int) (short) 2815, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
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
        int int30 = dynamicChannelBuffer1.bytesBefore(0, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setByte((int) (byte) 66, (int) '\u640a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
        dynamicChannelBuffer1.ensureWritableBytes(10);
        long long19 = dynamicChannelBuffer1.getUnsignedInt((int) (short) 0);
        dynamicChannelBuffer1.writeChar(13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelHandler channelHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext5 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=2, widx=8, cap=8)", channelHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer27.resetReaderIndex();
        byte[] byteArray29 = dynamicChannelBuffer27.array();
        dynamicChannelBuffer27.clear();
        dynamicChannelBuffer27.writeLong((long) 0);
        char char33 = dynamicChannelBuffer27.readChar();
        int int35 = dynamicChannelBuffer27.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset40 = null;
        java.lang.String str41 = dynamicChannelBuffer37.toString((int) (short) 1, (int) (short) 0, charset40);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer42 = dynamicChannelBuffer37.getbuffer();
        dynamicChannelBuffer37.writeInt((int) (short) 100);
        boolean boolean45 = dynamicChannelBuffer37.readable();
        int int46 = dynamicChannelBuffer27.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer37);
        byte[] byteArray47 = dynamicChannelBuffer27.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.getBytes((int) (byte) 0, byteArray47, 8, 4);
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
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(channelBuffer42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        int int7 = dynamicChannelBuffer5.bytesBefore((byte) -1);
        dynamicChannelBuffer5.markWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer5.getbuffer();
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer9);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int16 = dynamicChannelBuffer1.bytesBefore(5, (byte) 0);
        dynamicChannelBuffer1.markWriterIndex();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer14.clear();
        dynamicChannelBuffer14.writeLong((long) 0);
        char char20 = dynamicChannelBuffer14.readChar();
        int int22 = dynamicChannelBuffer14.getUnsignedMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        byte[] byteArray27 = dynamicChannelBuffer25.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer29.resetReaderIndex();
        byte[] byteArray31 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer25.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer29.readSlice(0);
        boolean boolean35 = dynamicChannelBuffer29.writable();
        dynamicChannelBuffer29.markWriterIndex();
        int int37 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        dynamicChannelBuffer29.clear();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        int int15 = dynamicChannelBuffer1.readableBytes();
        int int19 = dynamicChannelBuffer1.bytesBefore((-1), (int) (short) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
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
        char char26 = dynamicChannelBuffer1.readChar();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        dynamicChannelBuffer1.writeFloat((float) (short) 0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer1.factory();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) "");
        int int15 = dynamicChannelBuffer1.writerIndex();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer1.getendianness();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
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
        boolean boolean16 = dynamicChannelBuffer1.hasArray();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
        dynamicChannelBuffer13.writerIndex((int) (short) 100);
        int int36 = dynamicChannelBuffer13.writableBytes();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 28 + "'", int36 == 28);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        dynamicChannelBuffer1.setLong(5, 1L);
        dynamicChannelBuffer1.setMedium(0, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        dynamicChannelBuffer1.writeFloat((float) (short) 0);
        java.nio.ByteBuffer[] byteBufferArray15 = dynamicChannelBuffer1.toByteBuffers(0, (int) (short) 10);
        dynamicChannelBuffer1.writeFloat((float) (short) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBufferArray15);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
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
        int int26 = dynamicChannelBuffer1.indexOf((int) (byte) 0, 16, (byte) 10);
        int int28 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 100);
        dynamicChannelBuffer1.setFloat(4, (float) 1076101120);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        boolean boolean13 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.readSlice((int) (byte) 0);
        char char17 = dynamicChannelBuffer1.getChar((int) '#');
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dynamicChannelBuffer1.toString(charset18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer1.writeDouble((double) 10.0f);
        int int12 = dynamicChannelBuffer1.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dynamicChannelBuffer1.getLong((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer1.copy();
        dynamicChannelBuffer1.discardReadBytes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer17);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
            dynamicChannelBuffer5.setBoolean(5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
            int int14 = dynamicChannelBuffer9.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        dynamicChannelBuffer1.writeInt((int) (byte) -1);
        dynamicChannelBuffer1.markWriterIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer31.resetReaderIndex();
        byte[] byteArray33 = dynamicChannelBuffer31.array();
        dynamicChannelBuffer31.clear();
        dynamicChannelBuffer31.writeLong((long) 0);
        byte byte38 = dynamicChannelBuffer31.getByte(0);
        dynamicChannelBuffer31.writeShort((int) (short) 10);
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        dynamicChannelBuffer31.getBytes((int) (byte) 1, byteArray45);
        byte[] byteArray47 = dynamicChannelBuffer31.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer19.setBytes((-256), byteArray47, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0]");
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        dynamicChannelBuffer1.markWriterIndex();
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
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) 'a');
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer((int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.writeShort((int) (short) 1);
        int int4 = dynamicChannelBuffer1.writerIndex();
        float float6 = dynamicChannelBuffer1.getFloat(4);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer16.clear();
        dynamicChannelBuffer16.writeLong((long) 0);
        dynamicChannelBuffer16.writeDouble((double) (short) -1);
        float float24 = dynamicChannelBuffer16.readFloat();
        dynamicChannelBuffer16.setZero(5, 5);
        float float28 = dynamicChannelBuffer16.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer30.resetReaderIndex();
        byte[] byteArray32 = dynamicChannelBuffer30.array();
        dynamicChannelBuffer30.clear();
        dynamicChannelBuffer30.writeLong((long) 0);
        dynamicChannelBuffer30.writeDouble((double) (short) -1);
        int int38 = dynamicChannelBuffer30.readerIndex();
        byte byte39 = dynamicChannelBuffer30.readByte();
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30, 4);
        int int42 = dynamicChannelBuffer16.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int45 = dynamicChannelBuffer44.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder47 = null;
        int int48 = dynamicChannelBuffer44.bytesBefore((int) '\000', channelBufferIndexFinder47);
        byte[] byteArray49 = dynamicChannelBuffer44.array();
        dynamicChannelBuffer16.writeBytes(byteArray49);
        dynamicChannelBuffer1.readBytes(byteArray49);
        java.lang.String str52 = dynamicChannelBuffer1.toString();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory53 = dynamicChannelBuffer1.factory;
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "DynamicChannelBuffer(ridx=5, widx=7, cap=8)" + "'", str52, "DynamicChannelBuffer(ridx=5, widx=7, cap=8)");
        org.junit.Assert.assertNotNull(channelBufferFactory53);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        java.nio.ByteBuffer byteBuffer41 = dynamicChannelBuffer24.toByteBuffer();
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
        org.junit.Assert.assertNotNull(byteBuffer41);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        dynamicChannelBuffer1.setByte(5, 16);
        int int5 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.markReaderIndex();
        boolean boolean7 = dynamicChannelBuffer1.isDirect();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
        int int15 = dynamicChannelBuffer1.readableBytes();
        byte byte16 = dynamicChannelBuffer1.readByte();
        // The following exception was thrown during execution in test generation
        try {
            float float17 = dynamicChannelBuffer1.readFloat();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        byte byte20 = dynamicChannelBuffer13.getByte(0);
        dynamicChannelBuffer13.writeShort((int) (short) 10);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        dynamicChannelBuffer13.getBytes((int) (byte) 1, byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setBytes(16, byteArray27, (int) '\u4024', (-256));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0]");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset24 = null;
        java.lang.String str25 = dynamicChannelBuffer21.toString((int) (short) 1, (int) (short) 0, charset24);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer21.factory;
        int int27 = dynamicChannelBuffer21.readerIndex();
        int int28 = dynamicChannelBuffer21.readerIndex();
        dynamicChannelBuffer21.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset34 = null;
        java.lang.String str35 = dynamicChannelBuffer31.toString((int) (short) 1, (int) (short) 0, charset34);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory;
        dynamicChannelBuffer31.writeShort(4);
        java.nio.ByteBuffer byteBuffer39 = dynamicChannelBuffer31.toByteBuffer();
        dynamicChannelBuffer21.writeBytes(byteBuffer39);
        dynamicChannelBuffer1.readBytes(byteBuffer39);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer43.resetReaderIndex();
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer43.writeBytes(byteArray51);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory53 = dynamicChannelBuffer43.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer43.factory();
        boolean boolean56 = dynamicChannelBuffer43.equals((java.lang.Object) "");
        dynamicChannelBuffer43.writeLong(100L);
        dynamicChannelBuffer43.resetWriterIndex();
        dynamicChannelBuffer43.setBoolean((int) (byte) 10, false);
        dynamicChannelBuffer43.ensureWritableBytes((int) 'a');
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer43, 0);
        boolean boolean67 = dynamicChannelBuffer1.readable();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory53);
        org.junit.Assert.assertNotNull(channelBufferFactory54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
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
        // The following exception was thrown during execution in test generation
        try {
            double double29 = dynamicChannelBuffer20.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
        java.nio.channels.ScatteringByteChannel scatteringByteChannel33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = dynamicChannelBuffer5.setBytes((int) (byte) 100, scatteringByteChannel33, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        dynamicChannelBuffer1.resetReaderIndex();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        dynamicChannelBuffer1.setLong(5, 1L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer17.writeBytes(byteArray25);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer17.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory28 = dynamicChannelBuffer17.factory();
        boolean boolean30 = dynamicChannelBuffer17.equals((java.lang.Object) "");
        int int31 = dynamicChannelBuffer17.writerIndex();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 2);
        dynamicChannelBuffer17.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int37 = dynamicChannelBuffer36.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder39 = null;
        int int40 = dynamicChannelBuffer36.bytesBefore((int) '\000', channelBufferIndexFinder39);
        byte[] byteArray41 = dynamicChannelBuffer36.array();
        int int42 = dynamicChannelBuffer17.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer36);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer36.setMedium(2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory27);
        org.junit.Assert.assertNotNull(channelBufferFactory28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer3.resetReaderIndex();
        byte[] byteArray5 = dynamicChannelBuffer3.array();
        dynamicChannelBuffer3.clear();
        dynamicChannelBuffer3.writeLong((long) 0);
        dynamicChannelBuffer3.writeDouble((double) (short) -1);
        float float11 = dynamicChannelBuffer3.readFloat();
        dynamicChannelBuffer3.setZero(5, 5);
        dynamicChannelBuffer3.setLong(5, 1L);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer3.order();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(byteOrder18);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray12 = dynamicChannelBuffer10.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        int int19 = dynamicChannelBuffer14.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer14.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer22.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = dynamicChannelBuffer25.getbuffer();
        java.nio.ByteOrder byteOrder27 = dynamicChannelBuffer25.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder27, 0);
        dynamicChannelBuffer22.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        dynamicChannelBuffer22.writeDouble((double) 10.0f);
        dynamicChannelBuffer14.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        double double35 = dynamicChannelBuffer22.getDouble(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) (byte) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBuffer26);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer31.writeFloat((float) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer35.resetReaderIndex();
        byte[] byteArray37 = dynamicChannelBuffer35.array();
        dynamicChannelBuffer35.clear();
        dynamicChannelBuffer35.writeLong((long) 0);
        byte byte42 = dynamicChannelBuffer35.getByte(0);
        dynamicChannelBuffer35.writeShort((int) (short) 10);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        dynamicChannelBuffer35.getBytes((int) (byte) 1, byteArray49);
        dynamicChannelBuffer31.buffer = dynamicChannelBuffer35;
        dynamicChannelBuffer5.buffer = dynamicChannelBuffer35;
        dynamicChannelBuffer35.clear();
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
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 0 + "'", byte42 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 0, 0]");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.setShort(0, 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer15.writeBytes(byteArray23);
        dynamicChannelBuffer15.setFloat((int) (short) 0, 100.0f);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer29.resetReaderIndex();
        byte[] byteArray31 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer29.clear();
        dynamicChannelBuffer29.writeLong((long) 0);
        char char35 = dynamicChannelBuffer29.readChar();
        int int37 = dynamicChannelBuffer29.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset42 = null;
        java.lang.String str43 = dynamicChannelBuffer39.toString((int) (short) 1, (int) (short) 0, charset42);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer44 = dynamicChannelBuffer39.getbuffer();
        dynamicChannelBuffer39.writeInt((int) (short) 100);
        boolean boolean47 = dynamicChannelBuffer39.readable();
        int int48 = dynamicChannelBuffer29.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer39);
        byte[] byteArray49 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer15.readBytes(byteArray49, 1, (int) (byte) 1);
        dynamicChannelBuffer1.readBytes(byteArray49, 7, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer58 = dynamicChannelBuffer1.slice(256, (int) (byte) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(channelBuffer44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 66, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) '\u640a');
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer16.endianness;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dynamicChannelBuffer16.readUnsignedMedium();
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
        org.junit.Assert.assertNotNull(byteOrder17);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
        dynamicChannelBuffer13.writerIndex((int) (short) 100);
        dynamicChannelBuffer13.writeChar(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer40.resetReaderIndex();
        byte[] byteArray42 = dynamicChannelBuffer40.array();
        dynamicChannelBuffer40.clear();
        dynamicChannelBuffer40.writeLong((long) 0);
        char char46 = dynamicChannelBuffer40.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory47 = dynamicChannelBuffer40.factory;
        int int48 = dynamicChannelBuffer40.writerIndex();
        boolean boolean49 = dynamicChannelBuffer40.writable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer13.getBytes(1076101120, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, (int) (short) 100, 16);
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
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\000' + "'", char46 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
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
        java.nio.channels.ScatteringByteChannel scatteringByteChannel23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel23, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        int int5 = dynamicChannelBuffer1.bytesBefore((int) '\000', channelBufferIndexFinder4);
        byte[] byteArray6 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.writeChar(4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setShort((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
        dynamicChannelBuffer1.writeZero((int) (byte) 0);
        float float17 = dynamicChannelBuffer1.readFloat();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, (int) (byte) 10, channelBufferIndexFinder24);
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
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) 'a');
        short short3 = dynamicChannelBuffer1.getUnsignedByte(8);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.bytesBefore(1076101120, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer3.resetReaderIndex();
        byte[] byteArray5 = dynamicChannelBuffer3.array();
        dynamicChannelBuffer3.clear();
        dynamicChannelBuffer3.writeLong((long) 0);
        byte byte10 = dynamicChannelBuffer3.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer3.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer3.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder14);
        char char16 = dynamicChannelBuffer3.readChar();
        int int17 = dynamicChannelBuffer3.writerIndex();
        int int18 = dynamicChannelBuffer3.writableBytes();
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer21.getbuffer();
        java.nio.ByteOrder byteOrder23 = dynamicChannelBuffer21.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, (int) (short) 2815, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteOrder23);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder11);
        java.nio.channels.GatheringByteChannel gatheringByteChannel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.getBytes((int) (byte) 1, gatheringByteChannel14, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
        java.nio.charset.Charset charset19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dynamicChannelBuffer1.toString((int) (byte) 66, (int) (short) 10, charset19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
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
        int int15 = dynamicChannelBuffer1.readUnsignedMedium();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.getbuffer();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(channelBuffer16);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(16, (int) (short) -1, (int) '4', (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
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
        dynamicChannelBuffer1.writeDouble((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean(1076101120, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1076101120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
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
        int int16 = dynamicChannelBuffer1.readUnsignedShort();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer1.duplicate();
        boolean boolean18 = dynamicChannelBuffer1.writable();
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer1.endianness;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteOrder19);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        char char10 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.ensureWritableBytes(1);
        byte byte13 = dynamicChannelBuffer1.readByte();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer14.clear();
        dynamicChannelBuffer14.writeLong((long) 0);
        char char20 = dynamicChannelBuffer14.readChar();
        int int22 = dynamicChannelBuffer14.getUnsignedMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        boolean boolean24 = dynamicChannelBuffer14.isDirect();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        java.nio.ByteBuffer[] byteBufferArray15 = dynamicChannelBuffer1.toByteBuffers();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBufferArray15);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex((int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
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
        long long26 = dynamicChannelBuffer15.getUnsignedInt(0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
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
        int int26 = dynamicChannelBuffer1.indexOf((int) (byte) 0, 16, (byte) 10);
        dynamicChannelBuffer1.setInt(100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
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
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer1.buffer;
        java.io.InputStream inputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dynamicChannelBuffer1.writeBytes(inputStream22, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer21);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
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
            dynamicChannelBuffer1.readerIndex((int) '\u4024');
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
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        long long14 = dynamicChannelBuffer1.getLong(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.getbuffer();
        char char17 = dynamicChannelBuffer1.getChar(2);
        boolean boolean18 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer21.resetReaderIndex();
        byte[] byteArray23 = dynamicChannelBuffer21.array();
        dynamicChannelBuffer21.clear();
        dynamicChannelBuffer21.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer29.writeByte((int) (byte) 0);
        dynamicChannelBuffer21.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer35.resetReaderIndex();
        byte[] byteArray37 = dynamicChannelBuffer35.array();
        dynamicChannelBuffer35.clear();
        dynamicChannelBuffer35.writeLong((long) 0);
        char char41 = dynamicChannelBuffer35.readChar();
        int int43 = dynamicChannelBuffer35.getUnsignedMedium((int) (byte) 0);
        int int44 = dynamicChannelBuffer21.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer35);
        int int45 = dynamicChannelBuffer21.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer47 = dynamicChannelBuffer21.readBytes((int) (short) 0);
        boolean boolean48 = dynamicChannelBuffer21.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(65536, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 792462055231324160L + "'", long14 == 792462055231324160L);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\u640a' + "'", char17 == '\u640a');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0]");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(channelBuffer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
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
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer1.duplicate();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBuffer18);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
        dynamicChannelBuffer1.writeZero((int) (byte) 0);
        dynamicChannelBuffer1.writeChar((int) 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.writeFloat((float) '\000');
        dynamicChannelBuffer1.writeInt((int) (short) -1);
        byte byte6 = dynamicChannelBuffer1.readByte();
        int int8 = dynamicChannelBuffer1.getInt(2);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 65535 + "'", int8 == 65535);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
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
        int int23 = dynamicChannelBuffer1.readInt();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        boolean boolean13 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer19.resetReaderIndex();
        byte[] byteArray21 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer15.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        int int24 = dynamicChannelBuffer19.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer19.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer27.resetReaderIndex();
        byte[] byteArray29 = dynamicChannelBuffer27.array();
        dynamicChannelBuffer27.clear();
        dynamicChannelBuffer27.writeLong((long) 0);
        byte byte34 = dynamicChannelBuffer27.getByte(0);
        dynamicChannelBuffer27.writeFloat((float) 1L);
        dynamicChannelBuffer27.ensureWritableBytes((int) 'a');
        boolean boolean39 = dynamicChannelBuffer27.readable();
        dynamicChannelBuffer27.writeBoolean(true);
        int int42 = dynamicChannelBuffer27.readUnsignedShort();
        dynamicChannelBuffer19.buffer = dynamicChannelBuffer27;
        int int47 = dynamicChannelBuffer27.bytesBefore(5, (int) 'a', (byte) 100);
        dynamicChannelBuffer27.writerIndex((int) (short) 100);
        dynamicChannelBuffer27.writeChar(1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 0 + "'", byte34 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        dynamicChannelBuffer1.writeChar(16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer12.writeBytes(byteArray20);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer12.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer12.factory();
        boolean boolean25 = dynamicChannelBuffer12.equals((java.lang.Object) "");
        dynamicChannelBuffer12.writeLong(100L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer30.resetReaderIndex();
        byte[] byteArray32 = dynamicChannelBuffer30.array();
        dynamicChannelBuffer30.clear();
        dynamicChannelBuffer30.writeLong((long) 0);
        byte byte37 = dynamicChannelBuffer30.getByte(0);
        dynamicChannelBuffer30.writeFloat((float) 1L);
        dynamicChannelBuffer30.ensureWritableBytes((int) 'a');
        boolean boolean42 = dynamicChannelBuffer30.readable();
        dynamicChannelBuffer30.writeBoolean(true);
        dynamicChannelBuffer30.setDouble(0, 10.0d);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer48 = dynamicChannelBuffer30.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset53 = null;
        java.lang.String str54 = dynamicChannelBuffer50.toString((int) (short) 1, (int) (short) 0, charset53);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory55 = dynamicChannelBuffer50.factory;
        int int56 = dynamicChannelBuffer50.readerIndex();
        int int57 = dynamicChannelBuffer50.readerIndex();
        dynamicChannelBuffer50.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer60 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset63 = null;
        java.lang.String str64 = dynamicChannelBuffer60.toString((int) (short) 1, (int) (short) 0, charset63);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory65 = dynamicChannelBuffer60.factory;
        dynamicChannelBuffer60.writeShort(4);
        java.nio.ByteBuffer byteBuffer68 = dynamicChannelBuffer60.toByteBuffer();
        dynamicChannelBuffer50.writeBytes(byteBuffer68);
        dynamicChannelBuffer30.readBytes(byteBuffer68);
        dynamicChannelBuffer12.getBytes((int) (short) 1, byteBuffer68);
        dynamicChannelBuffer1.readBytes(byteBuffer68);
        java.lang.String str73 = dynamicChannelBuffer1.toString();
        boolean boolean74 = dynamicChannelBuffer1.readBoolean();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 0 + "'", byte37 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(channelBuffer48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(channelBufferFactory55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(channelBufferFactory65);
        org.junit.Assert.assertNotNull(byteBuffer68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=18, cap=32)" + "'", str73, "DynamicChannelBuffer(ridx=0, widx=18, cap=32)");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer19.resetReaderIndex();
        byte[] byteArray21 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer19.clear();
        dynamicChannelBuffer19.writeLong((long) 0);
        char char25 = dynamicChannelBuffer19.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer19.factory;
        dynamicChannelBuffer19.markReaderIndex();
        byte[] byteArray28 = dynamicChannelBuffer19.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer14.readBytes(byteArray28, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        int int9 = dynamicChannelBuffer1.capacity();
        boolean boolean10 = dynamicChannelBuffer1.readable();
        long long11 = dynamicChannelBuffer1.readLong();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt(5, (int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer10.toString((int) (short) 1, (int) (short) 0, charset13);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer10.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray19 = dynamicChannelBuffer17.array();
        dynamicChannelBuffer10.writeBytes(byteArray19);
        int int24 = dynamicChannelBuffer10.indexOf((int) (byte) 100, (int) (byte) 1, (byte) 100);
        boolean boolean25 = dynamicChannelBuffer5.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer5.slice(16, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        int int14 = dynamicChannelBuffer5.bytesBefore((int) (short) 10, (int) (byte) 0, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray17 = dynamicChannelBuffer5.toByteBuffers((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder11);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.indexOf((int) (byte) 1, (int) '#', channelBufferIndexFinder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray12 = dynamicChannelBuffer10.array();
        dynamicChannelBuffer10.clear();
        dynamicChannelBuffer10.writeLong((long) 0);
        char char16 = dynamicChannelBuffer10.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory17 = dynamicChannelBuffer10.factory;
        dynamicChannelBuffer10.markReaderIndex();
        byte[] byteArray19 = dynamicChannelBuffer10.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.setBytes((int) '\000', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.buffer;
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        byte[] byteArray14 = dynamicChannelBuffer12.array();
        dynamicChannelBuffer12.clear();
        dynamicChannelBuffer12.writeLong((long) 0);
        byte byte19 = dynamicChannelBuffer12.getByte(0);
        dynamicChannelBuffer12.writeFloat((float) 1L);
        dynamicChannelBuffer12.ensureWritableBytes((int) 'a');
        boolean boolean24 = dynamicChannelBuffer12.readable();
        dynamicChannelBuffer12.writeBoolean(true);
        java.nio.ByteBuffer[] byteBufferArray27 = dynamicChannelBuffer12.toByteBuffers();
        int int28 = dynamicChannelBuffer12.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '\u0aff', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteBufferArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 13 + "'", int28 == 13);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
        int int17 = dynamicChannelBuffer1.readUnsignedMedium();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer1.endianness;
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer22.resetReaderIndex();
        byte[] byteArray24 = dynamicChannelBuffer22.array();
        int int25 = dynamicChannelBuffer22.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer22.factory();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, (int) (short) -1, channelBufferFactory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(channelBufferFactory26);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer14.clear();
        dynamicChannelBuffer14.writeLong((long) 0);
        char char20 = dynamicChannelBuffer14.readChar();
        int int22 = dynamicChannelBuffer14.getUnsignedMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        byte[] byteArray27 = dynamicChannelBuffer25.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer29.resetReaderIndex();
        byte[] byteArray31 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer25.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer29.readSlice(0);
        boolean boolean35 = dynamicChannelBuffer29.writable();
        dynamicChannelBuffer29.markWriterIndex();
        int int37 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        int int38 = dynamicChannelBuffer29.readerIndex();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer14.clear();
        dynamicChannelBuffer14.writeLong((long) 0);
        char char20 = dynamicChannelBuffer14.readChar();
        int int22 = dynamicChannelBuffer14.getUnsignedMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer26.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder29 = null;
        int int30 = dynamicChannelBuffer26.bytesBefore((int) '\000', channelBufferIndexFinder29);
        byte[] byteArray31 = dynamicChannelBuffer26.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer14.setBytes(4, byteArray31, 720740, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer18.toString((int) (short) 1, (int) (short) 0, charset21);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer18.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        byte[] byteArray27 = dynamicChannelBuffer25.array();
        dynamicChannelBuffer18.writeBytes(byteArray27);
        int int29 = dynamicChannelBuffer18.readerIndex();
        int int30 = dynamicChannelBuffer18.capacity();
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
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
        dynamicChannelBuffer1.setLong(1, (long) ' ');
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
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
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
        int int17 = dynamicChannelBuffer1.readUnsignedMedium();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer21.getbuffer();
        java.nio.ByteOrder byteOrder23 = dynamicChannelBuffer21.order();
        int int24 = dynamicChannelBuffer21.readerIndex();
        dynamicChannelBuffer21.writeInt((int) 'a');
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10 };
        dynamicChannelBuffer21.writeBytes(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(256, byteArray29, (int) (byte) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 10]");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
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
        double double26 = dynamicChannelBuffer13.getDouble(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer29.resetReaderIndex();
        byte[] byteArray31 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer29.clear();
        dynamicChannelBuffer29.writeLong((long) 0);
        byte byte36 = dynamicChannelBuffer29.getByte(0);
        dynamicChannelBuffer29.writeFloat((float) 1L);
        dynamicChannelBuffer29.setShort((int) (short) 0, (int) (byte) 1);
        int int42 = dynamicChannelBuffer29.readUnsignedMedium();
        dynamicChannelBuffer29.writeFloat((float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer13.getBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29, 5);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 0 + "'", byte36 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 256 + "'", int42 == 256);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        int int5 = dynamicChannelBuffer1.bytesBefore((int) '\000', channelBufferIndexFinder4);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray8 = dynamicChannelBuffer1.toByteBuffers(13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder13);
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
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
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
        dynamicChannelBuffer1.setLong((int) (short) 1, (long) 0);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(2, outputStream27, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
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
        dynamicChannelBuffer1.discardReadBytes();
        byte byte21 = dynamicChannelBuffer1.getByte(13);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) "");
        dynamicChannelBuffer1.writeLong(100L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer19.resetReaderIndex();
        byte[] byteArray21 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer19.clear();
        dynamicChannelBuffer19.writeLong((long) 0);
        byte byte26 = dynamicChannelBuffer19.getByte(0);
        dynamicChannelBuffer19.writeFloat((float) 1L);
        dynamicChannelBuffer19.ensureWritableBytes((int) 'a');
        boolean boolean31 = dynamicChannelBuffer19.readable();
        dynamicChannelBuffer19.writeBoolean(true);
        dynamicChannelBuffer19.setDouble(0, 10.0d);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer37 = dynamicChannelBuffer19.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset42 = null;
        java.lang.String str43 = dynamicChannelBuffer39.toString((int) (short) 1, (int) (short) 0, charset42);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory44 = dynamicChannelBuffer39.factory;
        int int45 = dynamicChannelBuffer39.readerIndex();
        int int46 = dynamicChannelBuffer39.readerIndex();
        dynamicChannelBuffer39.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset52 = null;
        java.lang.String str53 = dynamicChannelBuffer49.toString((int) (short) 1, (int) (short) 0, charset52);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer49.factory;
        dynamicChannelBuffer49.writeShort(4);
        java.nio.ByteBuffer byteBuffer57 = dynamicChannelBuffer49.toByteBuffer();
        dynamicChannelBuffer39.writeBytes(byteBuffer57);
        dynamicChannelBuffer19.readBytes(byteBuffer57);
        dynamicChannelBuffer1.getBytes((int) (short) 1, byteBuffer57);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer63 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer63.resetReaderIndex();
        byte[] byteArray65 = dynamicChannelBuffer63.array();
        dynamicChannelBuffer63.clear();
        dynamicChannelBuffer63.writeLong((long) 0);
        dynamicChannelBuffer63.writeDouble((double) (short) -1);
        float float71 = dynamicChannelBuffer63.readFloat();
        dynamicChannelBuffer63.setZero(5, 5);
        dynamicChannelBuffer63.setLong(5, 1L);
        java.nio.ByteOrder byteOrder78 = dynamicChannelBuffer63.order();
        int int79 = dynamicChannelBuffer63.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(65536, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(channelBuffer37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(channelBufferFactory44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(channelBufferFactory54);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0]");
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(byteOrder78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 12 + "'", int79 == 12);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
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
        char char15 = dynamicChannelBuffer1.readChar();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer1.order();
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer1.toString(4, (int) (byte) 0, charset19);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        dynamicChannelBuffer1.setFloat(1, (float) (short) 10);
        int int13 = dynamicChannelBuffer1.writerIndex();
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer1.order();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(byteOrder14);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.factory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer5.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer14.clear();
        dynamicChannelBuffer14.writeLong((long) 0);
        char char20 = dynamicChannelBuffer14.readChar();
        int int22 = dynamicChannelBuffer14.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset27 = null;
        java.lang.String str28 = dynamicChannelBuffer24.toString((int) (short) 1, (int) (short) 0, charset27);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer24.getbuffer();
        dynamicChannelBuffer24.writeInt((int) (short) 100);
        boolean boolean32 = dynamicChannelBuffer24.readable();
        int int33 = dynamicChannelBuffer14.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        byte[] byteArray34 = dynamicChannelBuffer24.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.readBytes(byteArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(channelBuffer29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0, 0, 100]");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        int int5 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer7.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer17.getbuffer();
        dynamicChannelBuffer11.buffer = dynamicChannelBuffer17;
        dynamicChannelBuffer11.writeChar((int) (byte) 10);
        int int22 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
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
        java.nio.ByteBuffer[] byteBufferArray16 = dynamicChannelBuffer1.toByteBuffers();
        double double17 = dynamicChannelBuffer1.readDouble();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
        int int17 = dynamicChannelBuffer1.readUnsignedMedium();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (short) 10, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteOrder18);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.bytesBefore(8, channelBufferIndexFinder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.setInt(4, (-256));
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer1.endianness;
        java.nio.ByteBuffer byteBuffer16 = dynamicChannelBuffer1.toByteBuffer();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
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
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer18.resetReaderIndex();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer18.writeBytes(byteArray26);
        dynamicChannelBuffer18.setFloat((int) (short) 0, 100.0f);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer31 = dynamicChannelBuffer18.slice();
        java.nio.charset.Charset charset34 = null;
        java.lang.String str35 = dynamicChannelBuffer18.toString(256, 0, charset34);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((-1), (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBuffer31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
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
        int int23 = dynamicChannelBuffer1.getInt((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 65536 + "'", int23 == 65536);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer8.toString((int) (short) 1, (int) (short) 0, charset11);
        dynamicChannelBuffer8.discardReadBytes();
        int int14 = dynamicChannelBuffer8.readerIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer8.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory15);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer19.resetReaderIndex();
        byte[] byteArray21 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer19.clear();
        dynamicChannelBuffer19.writeLong((long) 0);
        byte byte26 = dynamicChannelBuffer19.getByte(0);
        dynamicChannelBuffer19.writeFloat((float) 1L);
        dynamicChannelBuffer19.ensureWritableBytes((int) 'a');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer33.resetReaderIndex();
        byte[] byteArray35 = dynamicChannelBuffer33.array();
        dynamicChannelBuffer33.clear();
        dynamicChannelBuffer33.writeLong((long) 0);
        byte byte40 = dynamicChannelBuffer33.getByte(0);
        dynamicChannelBuffer33.writeShort((int) (short) 10);
        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        dynamicChannelBuffer33.getBytes((int) (byte) 1, byteArray47);
        dynamicChannelBuffer19.setBytes((int) (byte) 0, byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer16.setBytes(0, byteArray47, (int) (short) 100, (int) (byte) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0]");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 0 + "'", byte40 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0, 0]");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertNotNull(channelBuffer12);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) -1);
        dynamicChannelBuffer1.writeShort(256);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBuffer14);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
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
        boolean boolean28 = dynamicChannelBuffer1.readable();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        int int9 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        byte[] byteArray14 = dynamicChannelBuffer12.array();
        dynamicChannelBuffer12.clear();
        dynamicChannelBuffer12.writeLong((long) 0);
        byte byte19 = dynamicChannelBuffer12.getByte(0);
        dynamicChannelBuffer12.writeShort((int) (short) 10);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        dynamicChannelBuffer12.getBytes((int) (byte) 1, byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(8, byteArray26, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0]");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        boolean boolean13 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.readSlice((int) (byte) 0);
        char char17 = dynamicChannelBuffer1.getChar((int) '#');
        int int18 = dynamicChannelBuffer1.readInt();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer20.resetReaderIndex();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer20.writeBytes(byteArray28);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer20.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory31 = dynamicChannelBuffer20.factory();
        boolean boolean33 = dynamicChannelBuffer20.equals((java.lang.Object) "");
        dynamicChannelBuffer20.writeLong(100L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer38.resetReaderIndex();
        byte[] byteArray40 = dynamicChannelBuffer38.array();
        dynamicChannelBuffer38.clear();
        dynamicChannelBuffer38.writeLong((long) 0);
        byte byte45 = dynamicChannelBuffer38.getByte(0);
        dynamicChannelBuffer38.writeFloat((float) 1L);
        dynamicChannelBuffer38.ensureWritableBytes((int) 'a');
        boolean boolean50 = dynamicChannelBuffer38.readable();
        dynamicChannelBuffer38.writeBoolean(true);
        dynamicChannelBuffer38.setDouble(0, 10.0d);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer56 = dynamicChannelBuffer38.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer58 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset61 = null;
        java.lang.String str62 = dynamicChannelBuffer58.toString((int) (short) 1, (int) (short) 0, charset61);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory63 = dynamicChannelBuffer58.factory;
        int int64 = dynamicChannelBuffer58.readerIndex();
        int int65 = dynamicChannelBuffer58.readerIndex();
        dynamicChannelBuffer58.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer68 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset71 = null;
        java.lang.String str72 = dynamicChannelBuffer68.toString((int) (short) 1, (int) (short) 0, charset71);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory73 = dynamicChannelBuffer68.factory;
        dynamicChannelBuffer68.writeShort(4);
        java.nio.ByteBuffer byteBuffer76 = dynamicChannelBuffer68.toByteBuffer();
        dynamicChannelBuffer58.writeBytes(byteBuffer76);
        dynamicChannelBuffer38.readBytes(byteBuffer76);
        dynamicChannelBuffer20.getBytes((int) (short) 1, byteBuffer76);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory30);
        org.junit.Assert.assertNotNull(channelBufferFactory31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0]");
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(channelBuffer56);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(channelBufferFactory63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(channelBufferFactory73);
        org.junit.Assert.assertNotNull(byteBuffer76);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.duplicate();
        int int10 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int14 = dynamicChannelBuffer13.readableBytes();
        int int15 = dynamicChannelBuffer13.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray19 = dynamicChannelBuffer17.array();
        java.lang.Class<?> wildcardClass20 = byteArray19.getClass();
        boolean boolean21 = dynamicChannelBuffer13.equals((java.lang.Object) wildcardClass20);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.writeByte((int) (byte) 0);
        dynamicChannelBuffer13.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer13.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer29.resetReaderIndex();
        byte[] byteArray31 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer29.clear();
        dynamicChannelBuffer29.writeLong((long) 0);
        char char35 = dynamicChannelBuffer29.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer29.factory;
        dynamicChannelBuffer29.markReaderIndex();
        byte[] byteArray38 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer13.writeBytes(byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '\u640a', byteArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer3.resetReaderIndex();
        byte[] byteArray5 = dynamicChannelBuffer3.array();
        dynamicChannelBuffer3.clear();
        dynamicChannelBuffer3.writeLong((long) 0);
        byte byte10 = dynamicChannelBuffer3.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer3.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer3.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder14);
        char char16 = dynamicChannelBuffer3.readChar();
        int int17 = dynamicChannelBuffer3.writerIndex();
        int int18 = dynamicChannelBuffer3.writableBytes();
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer21.resetReaderIndex();
        byte[] byteArray23 = dynamicChannelBuffer21.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        byte[] byteArray27 = dynamicChannelBuffer25.array();
        dynamicChannelBuffer21.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        int int30 = dynamicChannelBuffer25.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory31 = dynamicChannelBuffer25.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer33.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer37 = dynamicChannelBuffer36.getbuffer();
        java.nio.ByteOrder byteOrder38 = dynamicChannelBuffer36.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder38, 0);
        dynamicChannelBuffer33.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        dynamicChannelBuffer33.writeDouble((double) 10.0f);
        dynamicChannelBuffer25.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory31);
        org.junit.Assert.assertNotNull(channelBuffer37);
        org.junit.Assert.assertNotNull(byteOrder38);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
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
        int int17 = dynamicChannelBuffer1.readUnsignedMedium();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer1.endianness;
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer1.readSlice(65535);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteOrder19);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        dynamicChannelBuffer1.setByte(5, 16);
        int int5 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.markReaderIndex();
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
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
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer24.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer24.buffer;
        dynamicChannelBuffer24.writeFloat((float) ' ');
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer24.getfactory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((-256), (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertNotNull(channelBufferFactory30);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int16 = dynamicChannelBuffer1.bytesBefore(5, (byte) 0);
        dynamicChannelBuffer1.writeMedium((int) (byte) -1);
        boolean boolean19 = dynamicChannelBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        byte[] byteArray14 = dynamicChannelBuffer12.array();
        dynamicChannelBuffer12.clear();
        dynamicChannelBuffer12.writeLong((long) 0);
        int int18 = dynamicChannelBuffer12.readableBytes();
        dynamicChannelBuffer12.setBoolean((int) (byte) 0, false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int25 = dynamicChannelBuffer24.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder27 = null;
        int int28 = dynamicChannelBuffer24.bytesBefore((int) '\000', channelBufferIndexFinder27);
        byte[] byteArray29 = dynamicChannelBuffer24.array();
        dynamicChannelBuffer12.getBytes(5, byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(1076101120, byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer10.toString((int) (short) 1, (int) (short) 0, charset13);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer10.factory;
        int int16 = dynamicChannelBuffer10.readerIndex();
        int int17 = dynamicChannelBuffer10.readerIndex();
        dynamicChannelBuffer10.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer20.toString((int) (short) 1, (int) (short) 0, charset23);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer20.factory;
        dynamicChannelBuffer20.writeShort(4);
        java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer20.toByteBuffer();
        dynamicChannelBuffer10.writeBytes(byteBuffer28);
        dynamicChannelBuffer1.setBytes((int) (short) 1, byteBuffer28);
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer1.getendianness();
        dynamicChannelBuffer1.writeBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = dynamicChannelBuffer1.getDouble(65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteOrder31);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
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
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, 5, channelBufferIndexFinder36);
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
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        char char10 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.ensureWritableBytes(1);
        dynamicChannelBuffer1.writeByte((int) 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
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
        double double22 = dynamicChannelBuffer1.readDouble();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        int int9 = dynamicChannelBuffer1.readerIndex();
        short short11 = dynamicChannelBuffer1.getUnsignedByte(0);
        dynamicChannelBuffer1.writeBoolean(false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
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
        dynamicChannelBuffer24.writeByte(7);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = dynamicChannelBuffer24.bytesBefore(28, (int) (byte) 1, channelBufferIndexFinder29);
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
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
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
        dynamicChannelBuffer1.setShort(0, (int) '4');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        int int9 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.buffer;
        java.nio.channels.ScatteringByteChannel scatteringByteChannel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.writerIndex();
        byte[] byteArray8 = dynamicChannelBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (byte) 66, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer1.setChar(1, (int) 'a');
        byte byte17 = dynamicChannelBuffer1.readByte();
        int int18 = dynamicChannelBuffer1.capacity();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 66 + "'", byte17 == (byte) 66);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        dynamicChannelBuffer1.discardReadBytes();
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        java.lang.String str5 = dynamicChannelBuffer1.toString();
        int int7 = dynamicChannelBuffer1.bytesBefore((byte) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str5, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.setMedium((int) '\000', (int) (short) -1);
        java.nio.channels.GatheringByteChannel gatheringByteChannel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.getBytes((int) (byte) -1, gatheringByteChannel13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer35.resetReaderIndex();
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer35.writeBytes(byteArray43);
        dynamicChannelBuffer35.setFloat((int) (short) 0, 100.0f);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer49.resetReaderIndex();
        byte[] byteArray51 = dynamicChannelBuffer49.array();
        dynamicChannelBuffer49.clear();
        dynamicChannelBuffer49.writeLong((long) 0);
        byte byte56 = dynamicChannelBuffer49.getByte(0);
        long long57 = dynamicChannelBuffer49.readUnsignedInt();
        int int58 = dynamicChannelBuffer49.writableBytes();
        dynamicChannelBuffer49.writeLong((long) (short) 1);
        long long62 = dynamicChannelBuffer49.getUnsignedInt((int) (short) 1);
        int int63 = dynamicChannelBuffer49.readUnsignedMedium();
        dynamicChannelBuffer35.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer49);
        dynamicChannelBuffer13.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer49);
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
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0]");
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 0 + "'", byte56 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer18.resetReaderIndex();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer18.writeBytes(byteArray26);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory28 = dynamicChannelBuffer18.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory29 = dynamicChannelBuffer18.factory();
        boolean boolean31 = dynamicChannelBuffer18.equals((java.lang.Object) "");
        dynamicChannelBuffer18.writeLong(100L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer36.resetReaderIndex();
        byte[] byteArray38 = dynamicChannelBuffer36.array();
        dynamicChannelBuffer36.clear();
        dynamicChannelBuffer36.writeLong((long) 0);
        byte byte43 = dynamicChannelBuffer36.getByte(0);
        dynamicChannelBuffer36.writeFloat((float) 1L);
        dynamicChannelBuffer36.ensureWritableBytes((int) 'a');
        boolean boolean48 = dynamicChannelBuffer36.readable();
        dynamicChannelBuffer36.writeBoolean(true);
        dynamicChannelBuffer36.setDouble(0, 10.0d);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer54 = dynamicChannelBuffer36.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset59 = null;
        java.lang.String str60 = dynamicChannelBuffer56.toString((int) (short) 1, (int) (short) 0, charset59);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory61 = dynamicChannelBuffer56.factory;
        int int62 = dynamicChannelBuffer56.readerIndex();
        int int63 = dynamicChannelBuffer56.readerIndex();
        dynamicChannelBuffer56.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer66 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset69 = null;
        java.lang.String str70 = dynamicChannelBuffer66.toString((int) (short) 1, (int) (short) 0, charset69);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory71 = dynamicChannelBuffer66.factory;
        dynamicChannelBuffer66.writeShort(4);
        java.nio.ByteBuffer byteBuffer74 = dynamicChannelBuffer66.toByteBuffer();
        dynamicChannelBuffer56.writeBytes(byteBuffer74);
        dynamicChannelBuffer36.readBytes(byteBuffer74);
        dynamicChannelBuffer18.getBytes((int) (short) 1, byteBuffer74);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 2815, byteBuffer74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory28);
        org.junit.Assert.assertNotNull(channelBufferFactory29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0]");
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 0 + "'", byte43 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(channelBuffer54);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(channelBufferFactory61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(channelBufferFactory71);
        org.junit.Assert.assertNotNull(byteBuffer74);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer1.getUnsignedMedium((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer14.clear();
        dynamicChannelBuffer14.writeLong((long) 0);
        char char20 = dynamicChannelBuffer14.readChar();
        int int22 = dynamicChannelBuffer14.getUnsignedMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        byte[] byteArray27 = dynamicChannelBuffer25.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer29.resetReaderIndex();
        byte[] byteArray31 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer25.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer29.readSlice(0);
        boolean boolean35 = dynamicChannelBuffer29.writable();
        dynamicChannelBuffer29.markWriterIndex();
        int int37 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer40.resetReaderIndex();
        byte[] byteArray42 = dynamicChannelBuffer40.array();
        dynamicChannelBuffer40.clear();
        dynamicChannelBuffer40.writeLong((long) 0);
        dynamicChannelBuffer40.writeDouble((double) (short) -1);
        float float48 = dynamicChannelBuffer40.readFloat();
        dynamicChannelBuffer40.setZero(5, 5);
        float float52 = dynamicChannelBuffer40.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer54.resetReaderIndex();
        byte[] byteArray56 = dynamicChannelBuffer54.array();
        dynamicChannelBuffer54.clear();
        dynamicChannelBuffer54.writeLong((long) 0);
        dynamicChannelBuffer54.writeDouble((double) (short) -1);
        int int62 = dynamicChannelBuffer54.readerIndex();
        byte byte63 = dynamicChannelBuffer54.readByte();
        dynamicChannelBuffer40.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer54, 4);
        int int66 = dynamicChannelBuffer40.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer68 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int69 = dynamicChannelBuffer68.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder71 = null;
        int int72 = dynamicChannelBuffer68.bytesBefore((int) '\000', channelBufferIndexFinder71);
        byte[] byteArray73 = dynamicChannelBuffer68.array();
        dynamicChannelBuffer40.writeBytes(byteArray73);
        java.nio.ByteBuffer[] byteBufferArray75 = dynamicChannelBuffer40.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 2815, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, 13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 0 + "'", byte63 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[0]");
        org.junit.Assert.assertNotNull(byteBufferArray75);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(720740);
        dynamicChannelBuffer1.writerIndex((int) (byte) 100);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer10.toString((int) (short) 1, (int) (short) 0, charset13);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer10.factory;
        int int16 = dynamicChannelBuffer10.readerIndex();
        int int17 = dynamicChannelBuffer10.readerIndex();
        dynamicChannelBuffer10.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer20.toString((int) (short) 1, (int) (short) 0, charset23);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer20.factory;
        dynamicChannelBuffer20.writeShort(4);
        java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer20.toByteBuffer();
        dynamicChannelBuffer10.writeBytes(byteBuffer28);
        dynamicChannelBuffer1.setBytes((int) (short) 1, byteBuffer28);
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer1.getendianness();
        dynamicChannelBuffer1.writeBoolean(false);
        java.nio.charset.Charset charset34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dynamicChannelBuffer1.toString(charset34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertNotNull(byteBuffer28);
        org.junit.Assert.assertNotNull(byteOrder31);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        dynamicChannelBuffer1.setLong(5, 1L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer17.writeBytes(byteArray25);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer17.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory28 = dynamicChannelBuffer17.factory();
        boolean boolean30 = dynamicChannelBuffer17.equals((java.lang.Object) "");
        int int31 = dynamicChannelBuffer17.writerIndex();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 2);
        dynamicChannelBuffer1.writeInt((int) '\u640a');
        int int36 = dynamicChannelBuffer1.readUnsignedShort();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory27);
        org.junit.Assert.assertNotNull(channelBufferFactory28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer19.resetReaderIndex();
        byte[] byteArray21 = dynamicChannelBuffer19.array();
        dynamicChannelBuffer19.clear();
        dynamicChannelBuffer19.writeLong((long) 0);
        int int25 = dynamicChannelBuffer19.writerIndex();
        byte[] byteArray26 = dynamicChannelBuffer19.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(16, byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
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
        dynamicChannelBuffer1.writeBoolean(false);
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
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
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
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray25 = dynamicChannelBuffer23.array();
        dynamicChannelBuffer23.clear();
        dynamicChannelBuffer23.writeLong((long) 0);
        byte byte30 = dynamicChannelBuffer23.getByte(0);
        dynamicChannelBuffer23.writeFloat((float) 1L);
        dynamicChannelBuffer23.ensureWritableBytes((int) 'a');
        boolean boolean35 = dynamicChannelBuffer23.readable();
        dynamicChannelBuffer23.writeBoolean(true);
        dynamicChannelBuffer23.setDouble(0, 10.0d);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23, (int) (byte) 100, 2);
        dynamicChannelBuffer1.setFloat(4, 0.0f);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
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
        byte byte22 = dynamicChannelBuffer15.getByte(0);
        long long23 = dynamicChannelBuffer15.readUnsignedInt();
        int int24 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer15.writeLong((long) (short) 1);
        long long28 = dynamicChannelBuffer15.getUnsignedInt((int) (short) 1);
        int int29 = dynamicChannelBuffer15.readUnsignedMedium();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer33.resetReaderIndex();
        byte[] byteArray35 = dynamicChannelBuffer33.array();
        dynamicChannelBuffer33.clear();
        dynamicChannelBuffer33.writeLong((long) 0);
        int int39 = dynamicChannelBuffer33.writerIndex();
        byte[] byteArray40 = dynamicChannelBuffer33.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', byteArray40, (int) (short) 2815, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer8.writeInt(5);
        byte[] byteArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.setBytes(6, byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
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
        dynamicChannelBuffer1.writeLong((long) (-1));
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
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
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
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer5.endianness;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer5.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer17.writeBytes(byteArray25);
        int int27 = dynamicChannelBuffer17.readUnsignedMedium();
        boolean boolean28 = dynamicChannelBuffer5.equals((java.lang.Object) dynamicChannelBuffer17);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 720740 + "'", int27 == 720740);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
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
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, 1076101120);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer24.resetReaderIndex();
        byte[] byteArray26 = dynamicChannelBuffer24.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer28.resetReaderIndex();
        byte[] byteArray30 = dynamicChannelBuffer28.array();
        dynamicChannelBuffer24.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer28);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer33 = dynamicChannelBuffer28.readSlice(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer28.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) '\000', channelBufferFactory34);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer33);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = dynamicChannelBuffer19.getUnsignedInt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer1.writeDouble((double) 10.0f);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            char char14 = dynamicChannelBuffer1.getChar(7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(byteOrder12);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer10.toString((int) (short) 1, (int) (short) 0, charset13);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer10.factory;
        int int16 = dynamicChannelBuffer10.readerIndex();
        int int17 = dynamicChannelBuffer10.readerIndex();
        dynamicChannelBuffer10.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer20.toString((int) (short) 1, (int) (short) 0, charset23);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer20.factory;
        dynamicChannelBuffer20.writeShort(4);
        java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer20.toByteBuffer();
        dynamicChannelBuffer10.writeBytes(byteBuffer28);
        dynamicChannelBuffer1.setBytes((int) (short) 1, byteBuffer28);
        dynamicChannelBuffer1.setByte(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes(28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertNotNull(byteBuffer28);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
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
        int int17 = dynamicChannelBuffer1.readUnsignedMedium();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer1.endianness;
        int int19 = dynamicChannelBuffer1.readInt();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25600 + "'", int19 == 25600);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '\000', 720740, 13, 25600, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte14 = dynamicChannelBuffer5.readByte();
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
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        dynamicChannelBuffer1.writeLong((long) 5);
        boolean boolean13 = dynamicChannelBuffer1.getBoolean(6);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        byte byte22 = dynamicChannelBuffer15.getByte(0);
        dynamicChannelBuffer15.writeFloat((float) 1L);
        dynamicChannelBuffer15.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer15.getbuffer();
        dynamicChannelBuffer1.readBytes(channelBuffer28, 8, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer28);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer1.duplicate();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer11);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        long long14 = dynamicChannelBuffer1.getLong(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.getbuffer();
        char char17 = dynamicChannelBuffer1.getChar(2);
        boolean boolean18 = dynamicChannelBuffer1.hasArray();
        int int19 = dynamicChannelBuffer1.writerIndex();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 792462055231324160L + "'", long14 == 792462055231324160L);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\u640a' + "'", char17 == '\u640a');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int9 = dynamicChannelBuffer1.arrayOffset();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer16.clear();
        dynamicChannelBuffer16.writeLong((long) 0);
        dynamicChannelBuffer16.writeDouble((double) (short) -1);
        float float24 = dynamicChannelBuffer16.readFloat();
        dynamicChannelBuffer16.setZero(5, 5);
        float float28 = dynamicChannelBuffer16.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer30.resetReaderIndex();
        byte[] byteArray32 = dynamicChannelBuffer30.array();
        dynamicChannelBuffer30.clear();
        dynamicChannelBuffer30.writeLong((long) 0);
        dynamicChannelBuffer30.writeDouble((double) (short) -1);
        int int38 = dynamicChannelBuffer30.readerIndex();
        byte byte39 = dynamicChannelBuffer30.readByte();
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30, 4);
        int int42 = dynamicChannelBuffer16.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int45 = dynamicChannelBuffer44.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder47 = null;
        int int48 = dynamicChannelBuffer44.bytesBefore((int) '\000', channelBufferIndexFinder47);
        byte[] byteArray49 = dynamicChannelBuffer44.array();
        dynamicChannelBuffer16.writeBytes(byteArray49);
        dynamicChannelBuffer1.readBytes(byteArray49);
        dynamicChannelBuffer1.writeDouble((double) 28);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100]");
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer1.toByteBuffer();
        int int17 = dynamicChannelBuffer1.bytesBefore(10, (int) (byte) 10, (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer19.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder22 = null;
        int int23 = dynamicChannelBuffer19.bytesBefore((int) '\000', channelBufferIndexFinder22);
        byte[] byteArray24 = dynamicChannelBuffer19.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray24, (-4), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeBoolean(false);
        int int15 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.slice();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(channelBuffer16);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        char char10 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.ensureWritableBytes(1);
        long long13 = dynamicChannelBuffer1.readLong();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 211037513056256L + "'", long13 == 211037513056256L);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        dynamicChannelBuffer1.skipBytes(1);
        boolean boolean14 = dynamicChannelBuffer1.readBoolean();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.ensureWritableBytes(8);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBuffer15);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
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
        boolean boolean33 = dynamicChannelBuffer15.isDirect();
        boolean boolean34 = dynamicChannelBuffer15.hasArray();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1076101120 + "'", int30 == 1076101120);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1076101120L + "'", long32 == 1076101120L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        dynamicChannelBuffer5.discardReadBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer21.writeByte((int) (byte) 0);
        dynamicChannelBuffer13.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer27.resetReaderIndex();
        byte[] byteArray29 = dynamicChannelBuffer27.array();
        dynamicChannelBuffer27.clear();
        dynamicChannelBuffer27.writeLong((long) 0);
        char char33 = dynamicChannelBuffer27.readChar();
        int int35 = dynamicChannelBuffer27.getUnsignedMedium((int) (byte) 0);
        int int36 = dynamicChannelBuffer13.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
        int int37 = dynamicChannelBuffer13.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer39 = dynamicChannelBuffer13.readBytes((int) (short) 0);
        boolean boolean40 = dynamicChannelBuffer13.readable();
        short short41 = dynamicChannelBuffer13.readUnsignedByte();
        dynamicChannelBuffer5.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        java.nio.ByteOrder byteOrder43 = dynamicChannelBuffer13.order();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(channelBuffer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 0 + "'", short41 == (short) 0);
        org.junit.Assert.assertNotNull(byteOrder43);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
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
        dynamicChannelBuffer11.writeFloat((float) (byte) 66);
        byte byte19 = dynamicChannelBuffer11.readByte();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 66 + "'", byte19 == (byte) 66);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        double double9 = dynamicChannelBuffer1.readDouble();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.copy();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.writeShort(4);
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer1.toByteBuffer();
        short short10 = dynamicChannelBuffer1.readUnsignedByte();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.getUnsignedMedium((-256));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
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
            dynamicChannelBuffer7.setDouble(65535, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer6.resetReaderIndex();
        byte[] byteArray8 = dynamicChannelBuffer6.array();
        dynamicChannelBuffer6.clear();
        dynamicChannelBuffer6.writeLong((long) 0);
        byte byte13 = dynamicChannelBuffer6.getByte(0);
        long long14 = dynamicChannelBuffer6.readUnsignedInt();
        int int15 = dynamicChannelBuffer6.writableBytes();
        dynamicChannelBuffer6.writeLong((long) (short) 1);
        long long19 = dynamicChannelBuffer6.getUnsignedInt((int) (short) 1);
        dynamicChannelBuffer6.writeZero((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray25 = dynamicChannelBuffer23.array();
        dynamicChannelBuffer23.clear();
        dynamicChannelBuffer23.writeLong((long) 0);
        byte byte30 = dynamicChannelBuffer23.getByte(0);
        dynamicChannelBuffer23.writeShort((int) (short) 10);
        java.nio.ByteOrder byteOrder33 = dynamicChannelBuffer23.endianness;
        dynamicChannelBuffer23.setByte(5, 720740);
        dynamicChannelBuffer23.writeBoolean(false);
        int int39 = dynamicChannelBuffer23.readUnsignedMedium();
        long long41 = dynamicChannelBuffer23.getLong((int) '\000');
        double double42 = dynamicChannelBuffer23.readDouble();
        java.nio.ByteBuffer byteBuffer43 = dynamicChannelBuffer23.toByteBuffer();
        boolean boolean44 = dynamicChannelBuffer6.equals((java.lang.Object) byteBuffer43);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) ' ', byteBuffer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 6553600L + "'", long41 == 6553600L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 5.4323092249976E-310d + "'", double42 == 5.4323092249976E-310d);
        org.junit.Assert.assertNotNull(byteBuffer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        boolean boolean13 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.readSlice((int) (byte) 0);
        char char17 = dynamicChannelBuffer1.getChar((int) '#');
        int int18 = dynamicChannelBuffer1.readInt();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer1.duplicate();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
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
        int int17 = dynamicChannelBuffer1.readUnsignedMedium();
        long long19 = dynamicChannelBuffer1.getLong((int) '\000');
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer1.factory();
        dynamicChannelBuffer1.writeLong((long) 65536);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 6553600L + "'", long19 == 6553600L);
        org.junit.Assert.assertNotNull(channelBufferFactory20);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        int int5 = dynamicChannelBuffer1.bytesBefore((int) '\000', channelBufferIndexFinder4);
        byte[] byteArray6 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer8.clear();
        dynamicChannelBuffer8.writeLong((long) 0);
        byte byte15 = dynamicChannelBuffer8.getByte(0);
        dynamicChannelBuffer8.writeFloat((float) 1L);
        dynamicChannelBuffer8.setShort((int) (short) 0, (int) (byte) 1);
        int int21 = dynamicChannelBuffer8.readUnsignedMedium();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer8.getfactory();
        java.nio.ByteOrder byteOrder23 = dynamicChannelBuffer8.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        byte[] byteArray27 = dynamicChannelBuffer25.array();
        dynamicChannelBuffer8.writeBytes(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 256 + "'", int21 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer9.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder19 = null;
        int int20 = dynamicChannelBuffer16.bytesBefore((int) '\000', channelBufferIndexFinder19);
        byte[] byteArray21 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer9.readBytes(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.setLong(2, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
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
        int int14 = dynamicChannelBuffer5.readerIndex();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer16.clear();
        dynamicChannelBuffer16.writeLong((long) 0);
        dynamicChannelBuffer16.writeDouble((double) (short) -1);
        float float24 = dynamicChannelBuffer16.readFloat();
        dynamicChannelBuffer16.setZero(5, 5);
        float float28 = dynamicChannelBuffer16.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer30.resetReaderIndex();
        byte[] byteArray32 = dynamicChannelBuffer30.array();
        dynamicChannelBuffer30.clear();
        dynamicChannelBuffer30.writeLong((long) 0);
        dynamicChannelBuffer30.writeDouble((double) (short) -1);
        int int38 = dynamicChannelBuffer30.readerIndex();
        byte byte39 = dynamicChannelBuffer30.readByte();
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30, 4);
        int int42 = dynamicChannelBuffer16.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int45 = dynamicChannelBuffer44.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder47 = null;
        int int48 = dynamicChannelBuffer44.bytesBefore((int) '\000', channelBufferIndexFinder47);
        byte[] byteArray49 = dynamicChannelBuffer44.array();
        dynamicChannelBuffer16.writeBytes(byteArray49);
        dynamicChannelBuffer1.readBytes(byteArray49);
        java.lang.String str52 = dynamicChannelBuffer1.toString();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer55.resetReaderIndex();
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer55.writeBytes(byteArray63);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory65 = dynamicChannelBuffer55.getfactory();
        int int69 = dynamicChannelBuffer55.indexOf(10, (int) (byte) 0, (byte) 0);
        dynamicChannelBuffer1.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer55, 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "DynamicChannelBuffer(ridx=5, widx=7, cap=8)" + "'", str52, "DynamicChannelBuffer(ridx=5, widx=7, cap=8)");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 7 + "'", int69 == 7);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        boolean boolean9 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer1.getfactory();
        boolean boolean11 = dynamicChannelBuffer1.hasArray();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        int int9 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.setLong((int) (short) 0, (long) 1076101120);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer1.order();
        int int17 = dynamicChannelBuffer1.indexOf((-4), (int) (byte) 0, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        int int9 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.markReaderIndex();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.buffer;
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = dynamicChannelBuffer1.getByte(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
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
            boolean boolean26 = dynamicChannelBuffer24.getBoolean((int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        byte byte18 = dynamicChannelBuffer11.getByte(0);
        dynamicChannelBuffer11.writeFloat((float) 1L);
        dynamicChannelBuffer11.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer28.getbuffer();
        java.nio.ByteOrder byteOrder30 = dynamicChannelBuffer28.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder30, 0);
        dynamicChannelBuffer25.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32);
        dynamicChannelBuffer25.writeDouble((double) 10.0f);
        int int36 = dynamicChannelBuffer11.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        dynamicChannelBuffer11.discardReadBytes();
        dynamicChannelBuffer11.writeFloat((float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setBytes(7, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 4, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer29);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.markWriterIndex();
        dynamicChannelBuffer1.writeZero(65536);
        dynamicChannelBuffer1.ensureWritableBytes((int) '\000');
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.writeInt(13);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        java.nio.ByteBuffer[] byteBufferArray12 = dynamicChannelBuffer1.toByteBuffers((int) (short) 0, 0);
        int int13 = dynamicChannelBuffer1.readUnsignedShort();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer1.getbuffer();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteBufferArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer4.resetReaderIndex();
        byte[] byteArray6 = dynamicChannelBuffer4.array();
        dynamicChannelBuffer4.clear();
        dynamicChannelBuffer4.writeLong((long) 0);
        byte byte11 = dynamicChannelBuffer4.getByte(0);
        dynamicChannelBuffer4.writeFloat((float) 1L);
        dynamicChannelBuffer4.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer18.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer21.getbuffer();
        java.nio.ByteOrder byteOrder23 = dynamicChannelBuffer21.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder23, 0);
        dynamicChannelBuffer18.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        dynamicChannelBuffer18.writeDouble((double) 10.0f);
        int int29 = dynamicChannelBuffer4.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer4.factory;
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer4;
        // The following exception was thrown during execution in test generation
        try {
            char char33 = dynamicChannelBuffer4.getChar((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory30);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(256, 65535, 13, 65535, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        int int9 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.setLong((int) (short) 0, (long) 1076101120);
        int int13 = dynamicChannelBuffer1.arrayOffset();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(1076101120);
        dynamicChannelBuffer1.writeLong((long) (short) 10);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 100);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
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
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
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
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 1, 0, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 10, 1, (int) (byte) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 1, (int) (byte) 1, (int) (short) -1, (int) (byte) 0, true);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) '#', (int) (byte) 10, (int) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (byte) -1, (int) (short) 100, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
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
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
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
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (byte) 10, (int) (short) 10, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 100, (int) (byte) 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) 'a', (int) (short) 1, (int) (short) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
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
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) 0, (int) (byte) -1, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 1, (-1), (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (100) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) ' ');
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 1, (int) (byte) 0, (int) '4', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
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
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (32) must be equal to or greater than lengthFieldOffset (97) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (short) 0, (int) (byte) 100, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
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
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 0, 0, (int) (short) -1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) 0, (int) (byte) 10, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
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
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) '#', (int) (byte) -1, (int) ' ', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 10, 10, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', 100, (int) (short) 0, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
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
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) 100, (int) 'a', (int) (short) 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (-1), (int) ' ', (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) '4', (int) ' ', (int) (short) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
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
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 1, (int) (short) 1, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
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
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
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
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
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
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
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
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
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
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) -1, (int) '4', (int) (byte) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
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
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) 1, 100, (int) (short) 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) '#', 100, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) '4', (int) '#', (int) (byte) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 1, 0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) '#', channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 100, (int) (short) 0, (int) (byte) 100, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 10, (int) (byte) -1, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) -1, (int) (short) -1, (-1), (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
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
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
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
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (short) 100, (int) 'a', (int) (short) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) '4', channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (-1), (int) (byte) -1, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) -1, (int) '4', (int) (short) -1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 0, (int) ' ', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) 10, (int) (short) 100, (int) '#', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

