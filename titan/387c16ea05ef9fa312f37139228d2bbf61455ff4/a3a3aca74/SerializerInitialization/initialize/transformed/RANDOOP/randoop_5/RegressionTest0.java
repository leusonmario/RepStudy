import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 10;
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) 10;
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ID allocation overflow!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 1;
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 100;
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) 100;
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        java.lang.Class<?> wildcardClass2 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = ' ';
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) -1;
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) 10;
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (-1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 0;
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) 100;
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 0;
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) 100;
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        java.lang.Class<?> wildcardClass5 = dataOutput4.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        java.lang.Class<?> wildcardClass5 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) 1;
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ID has already been registered: 2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization serializerInitialization0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization();
        java.lang.Class<?> wildcardClass1 = serializerInitialization0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 10;
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) 10;
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 1;
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 256;
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) 1;
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) -1;
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) 0;
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = '4';
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = '#';
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) 0;
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (-1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 'a';
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, true);
            org.junit.Assert.fail("Expected exception of type com.esotericsoftware.kryo.KryoException; message: An existing registration with a different type already uses ID: 1?Existing registration: [1, String]?Unable to set registration: [1, String[]]");
        } catch (com.esotericsoftware.kryo.KryoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) 1;
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = '4';
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) 0;
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) 10;
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (short) 100;
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (byte) 0;
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = '#';
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) -1;
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 100;
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = 'a';
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = (short) -1;
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = 256;
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) '#', false);
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
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(1, true);
        java.lang.Class<?> wildcardClass11 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(1, true);
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) '#', false);
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(1, true);
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
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 100, true);
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) (short) 100, true);
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(1, true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(1, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(0, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput19 = kryoSerializer1.getDataOutput(10, false);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
        org.junit.Assert.assertNotNull(dataOutput19);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, true);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(1, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, false);
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
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(1, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(0, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(0, true);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput19 = kryoSerializer1.getDataOutput((int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(100, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput19 = kryoSerializer1.getDataOutput((int) ' ', true);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
        org.junit.Assert.assertNotNull(dataOutput19);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) ' ', true);
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
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) '#', false);
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
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) ' ', true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput(1, true);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 100, true);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput16 = kryoSerializer1.getDataOutput((int) (byte) 100, true);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
        org.junit.Assert.assertNotNull(dataOutput16);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET = (byte) 1;
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput(100, true);
            org.junit.Assert.fail("Expected exception of type com.esotericsoftware.kryo.KryoException; message: An existing registration with a different type already uses ID: 2?Existing registration: [2, float]?Unable to set registration: [2, String[]]");
        } catch (com.esotericsoftware.kryo.KryoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        java.lang.Class<?> wildcardClass8 = dataOutput7.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        java.lang.Class<?> wildcardClass8 = kryoSerializer1.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput(0, false);
        java.lang.Class<?> wildcardClass11 = dataOutput10.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 1, false);
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
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 1, false);
        java.lang.Class<?> wildcardClass11 = dataOutput10.getClass();
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput(1, true);
            org.junit.Assert.fail("Expected exception of type com.esotericsoftware.kryo.KryoException; message: An existing registration with a different type already uses ID: 2?Existing registration: [2, float]?Unable to set registration: [2, String[]]");
        } catch (com.esotericsoftware.kryo.KryoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
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
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput((int) 'a', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) (byte) 10, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (byte) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ID has already been registered: 2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ID has already been registered: 2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) '#', false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer1.getDataOutput((int) (short) 100, false);
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
        org.junit.Assert.assertNotNull(dataOutput10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput4 = kryoSerializer1.getDataOutput(1, false);
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput7 = kryoSerializer1.getDataOutput((int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer1.getDataOutput((int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataOutput4);
        org.junit.Assert.assertNotNull(dataOutput7);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET = ' ';
    }
}

