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
        int int0 = com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ID has already been registered: 41");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ID has already been registered: 41");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 10;
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = kryoSerializer1.readClassAndObject(readBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 1;
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 100;
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) 100;
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization serializerInitialization0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization();
        java.lang.Class<?> wildcardClass1 = serializerInitialization0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        java.lang.Class<?> wildcardClass5 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) -1;
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) 10;
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (-1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 0;
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 0;
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) 10;
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) 100;
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, false);
        java.lang.Class<?> wildcardClass5 = dataOutput4.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = ' ';
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = kryoSerializer1.readClassAndObject(readBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = kryoSerializer1.readClassAndObject(readBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) 0;
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        java.lang.Class<?> wildcardClass2 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.thinkaurelius.titan.graphdb.database.serialize.Serializer serializer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize(serializer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 10;
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 1;
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 256;
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) 1;
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) -1;
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) 0;
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = '#';
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type com.esotericsoftware.kryo.KryoException; message: An existing registration with a different type already uses ID: 1?Existing registration: [1, String]?Unable to set registration: [1, String[]]");
        } catch (com.esotericsoftware.kryo.KryoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) 0;
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (-1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 'a';
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput(0, true);
            org.junit.Assert.fail("Expected exception of type com.esotericsoftware.kryo.KryoException; message: An existing registration with a different type already uses ID: 1?Existing registration: [1, String]?Unable to set registration: [1, String[]]");
        } catch (com.esotericsoftware.kryo.KryoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) 1;
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) 1;
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = '4';
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) 1;
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) 10;
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) 100;
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = '#';
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) -1;
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) 10;
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = '4';
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        java.lang.Class<?> wildcardClass5 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        java.lang.Class<?> wildcardClass5 = dataOutput4.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        java.lang.Class<?> wildcardClass8 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) 0;
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 'a';
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) -1;
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 256;
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        java.lang.Class<?> wildcardClass11 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, true);
        java.lang.Class<?> wildcardClass5 = dataOutput4.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        java.lang.Class<?> wildcardClass11 = dataOutput10.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) 100;
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = kryoSerializer1.readClassAndObject(readBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        java.lang.Class<?> wildcardClass14 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = kryoSerializer1.readClassAndObject(readBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput((int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) ' ', true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(100, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) ' ', true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (byte) 100, true);
        java.lang.Class<?> wildcardClass14 = dataOutput13.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(10, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) ' ', true);
        java.lang.Class<?> wildcardClass8 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(100, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput19 = kryoSerializer1.getDataOutput((int) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
        org.junit.Assert.assertNotNull(dataOutput19);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(100, false);
        java.lang.Class<?> wildcardClass17 = dataOutput16.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(100, true);
        java.lang.Class<?> wildcardClass14 = dataOutput13.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) ' ', true);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = kryoSerializer1.readClassAndObject(readBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = kryoSerializer1.readClassAndObject(readBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, false);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = kryoSerializer1.readClassAndObject(readBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(10, false);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = kryoSerializer1.readClassAndObject(readBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        java.lang.Class<?> wildcardClass11 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = kryoSerializer1.readClassAndObject(readBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ID has already been registered: 101");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(100, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput19 = kryoSerializer1.getDataOutput((int) ' ', true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput22 = kryoSerializer1.getDataOutput((int) (short) 10, false);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = kryoSerializer1.readClassAndObject(readBuffer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
        org.junit.Assert.assertNotNull(dataOutput19);
        org.junit.Assert.assertNotNull(dataOutput22);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, false);
        java.lang.Class<?> wildcardClass14 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(100, true);
        java.lang.Class<?> wildcardClass14 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput((int) (byte) 1, false);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = kryoSerializer1.readClassAndObject(readBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(100, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput19 = kryoSerializer1.getDataOutput((int) ' ', false);
        java.lang.Class<?> wildcardClass20 = dataOutput19.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
        org.junit.Assert.assertNotNull(dataOutput19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(1, true);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput((int) (byte) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) ' ', true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(1, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, false);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput19 = kryoSerializer1.getDataOutput(256, true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Serializer has already been initialized!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
        org.junit.Assert.assertNotNull(dataOutput19);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput19 = kryoSerializer1.getDataOutput((int) (short) 100, false);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
        org.junit.Assert.assertNotNull(dataOutput19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 10, false);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        java.lang.Class<?> wildcardClass8 = dataOutput7.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 100;
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(100, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput19 = kryoSerializer1.getDataOutput((int) ' ', true);
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = kryoSerializer1.readClassAndObject(readBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
        org.junit.Assert.assertNotNull(dataOutput19);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, true);
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ID has already been registered: 101");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) 10, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        java.lang.Class<?> wildcardClass14 = dataOutput13.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = ' ';
    }
}

