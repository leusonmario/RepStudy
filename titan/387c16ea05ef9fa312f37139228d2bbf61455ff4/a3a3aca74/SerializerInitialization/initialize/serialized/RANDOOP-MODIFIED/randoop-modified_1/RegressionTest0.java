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
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer312();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer105();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        java.lang.ThreadLocal<com.esotericsoftware.kryo.Kryo> kryoThreadLocal5 = kryoSerializer4.kryos;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoThreadLocal5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.RESERVED_ID_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        boolean boolean4 = kryoSerializer3.initialized;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.MAX_OUTPUT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10485760 + "'", int0 == 10485760);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer144();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer129();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        java.util.Map<java.lang.Integer, com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration> intMap3 = kryoSerializer2.getregistrations();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(intMap3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        com.esotericsoftware.kryo.Serializer serializer7 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration8 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer7);
        com.esotericsoftware.kryo.Serializer serializer9 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration10 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer9);
        com.esotericsoftware.kryo.Serializer serializer11 = typeRegistration10.getserializer();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(serializer11);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = kryoSerializer6.readClassAndObject(readBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer288();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer114();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer165();
        com.google.common.cache.Cache<java.lang.Class<?>, java.lang.Boolean> wildcardClassCache6 = kryoSerializer5.getobjectVerificationCache();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(wildcardClassCache6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        com.esotericsoftware.kryo.Serializer serializer7 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration8 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer7);
        com.esotericsoftware.kryo.Serializer serializer9 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration10 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer9);
        com.esotericsoftware.kryo.Serializer serializer11 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration12 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer11);
        com.esotericsoftware.kryo.Serializer serializer13 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration14 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer13);
        com.esotericsoftware.kryo.Serializer serializer15 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration16 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer15);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer355();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer251();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        boolean boolean6 = kryoSerializer5.getinitialized();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer401();
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = kryoSerializer7.readClassAndObject(readBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.Class class0 = null;
        com.esotericsoftware.kryo.Serializer serializer1 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration2 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class0, serializer1);
        java.lang.Class class3 = typeRegistration2.type;
        org.junit.Assert.assertNull(class3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer110();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer390();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer323();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer161();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer176();
        java.util.Map<java.lang.Integer, com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration> intMap6 = kryoSerializer5.registrations;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(intMap6);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        boolean boolean5 = kryoSerializer4.getinitialized();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer270();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer261();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer396();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer293();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer126();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer219();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer190();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer35();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer224();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer152();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        boolean boolean3 = kryoSerializer2.registerRequired;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer33();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer57();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer401();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer281();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer210();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer96();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer371();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer133();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer38();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        boolean boolean5 = kryoSerializer4.getregisterRequired();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer376();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer3();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer145();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer314();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.google.common.cache.Cache<java.lang.Class<?>, java.lang.Boolean> wildcardClassCache5 = kryoSerializer4.objectVerificationCache;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(wildcardClassCache5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer302();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer349();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer65();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer178();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer376();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer32();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer269();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer389();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer251();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer312();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        com.esotericsoftware.kryo.Kryo kryo5 = kryoSerializer4.getKryo();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryo5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer104();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer184();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer71();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer126();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = kryoSerializer5.readClassAndObject(readBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer301();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer83();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer120();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer343();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer121();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer114();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer32();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer178();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer115();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer386();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer355();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer70();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer32();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer188();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer32();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer119();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer264();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer69();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer32();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer31();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer235();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer339();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer261();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer396();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer293();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer71();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.thinkaurelius.titan.diskstorage.StaticBuffer.Factory<com.esotericsoftware.kryo.io.Input> inputFactory0 = com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.INPUT_FACTORY;
        org.junit.Assert.assertNotNull(inputFactory0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer119();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer264();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer116();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer80();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer346();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer355();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer301();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer191();
        boolean boolean6 = kryoSerializer5.registerRequired;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer73();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer225();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer5();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer251();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer393();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer22();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        com.esotericsoftware.kryo.Serializer serializer7 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration8 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer7);
        com.esotericsoftware.kryo.Serializer serializer9 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration10 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer9);
        java.lang.Class class11 = typeRegistration10.gettype();
        java.lang.Class class12 = typeRegistration10.type;
        com.esotericsoftware.kryo.Serializer serializer13 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration14 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class12, serializer13);
        com.esotericsoftware.kryo.Serializer serializer15 = typeRegistration14.serializer;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(serializer15);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer229();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer240();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer386();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer308();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer398();
        kryoSerializer5.initialized = false;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer141();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer256();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer367();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer410();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer412();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer28();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer40();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer56();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer15();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer330();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer253();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer381();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer391();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer219();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer179();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        java.util.Map<java.lang.Integer, com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration> intMap7 = kryoSerializer6.registrations;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(intMap7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer98();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer298();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer165();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer271();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer179();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer264();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer325();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer351();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer386();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer244();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer405();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer258();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer156();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer43();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer339();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer28();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer154();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer378();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer117();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer407();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer76();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer9();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer111();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer179();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer168();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer192();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer67();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer407();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer76();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer27();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.esotericsoftware.kryo.Kryo kryo4 = kryoSerializer3.getKryo();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryo4);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer152();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer291();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer66();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer347();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer188();
        com.thinkaurelius.titan.diskstorage.ReadBuffer readBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = kryoSerializer6.readClassAndObject(readBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer391();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer65();
        com.thinkaurelius.titan.diskstorage.StaticBuffer.Factory<com.esotericsoftware.kryo.io.Input> inputFactory6 = kryoSerializer5.getINPUT_FACTORY();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(inputFactory6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer276();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer113();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer284();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer333();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer326();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer376();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer309();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer187();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer154();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer199();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer404();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer179();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer152();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer29();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer401();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer194();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer280();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer205();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer349();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer39();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer337();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer30();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer5();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer251();
        boolean boolean9 = kryoSerializer8.getregisterRequired();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer346();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer297();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer376();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer261();
        boolean boolean5 = kryoSerializer4.getinitialized();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer393();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer5();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer377();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer40();
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput8 = kryoSerializer5.getDataOutput((int) (byte) 100, false);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(dataOutput8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer325();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer351();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer386();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer230();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer293();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer284();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer199();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer369();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer312();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer407();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer76();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer27();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer35();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer133();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer167();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer308();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer376();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer309();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer369();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer362();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer252();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer187();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer362();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer252();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer124();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer20();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer410();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer411();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer85();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer62();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer5();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer337();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer98();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer181();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer320();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer325();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer319();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer318();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer378();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer261();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer368();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer153();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer137();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer303();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer144();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer148();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer41();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer84();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer368();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer67();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer204();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer144();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer100();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer396();
        boolean boolean10 = kryoSerializer9.initialized;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer339();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer29();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer339();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer353();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer163();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer73();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer410();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer410();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer172();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer39();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer302();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer258();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer236();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int0 = com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40 + "'", int0 == 40);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer165();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer131();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer179();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer351();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer389();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer74();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer(true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer291();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer291();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer29();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer325();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer351();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer273();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer265();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer38();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer325();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer384();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer329();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer167();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer116();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer226();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer382();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer73();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer167();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer83();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer349();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer363();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer390();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer75();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer11();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer191();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer123();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer11();
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput10 = kryoSerializer7.getDataOutput((int) (byte) 0, false);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(dataOutput10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer86();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer166();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer400();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer209();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer126();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer28();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer9();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer336();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer396();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer179();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer190();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer168();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer181();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer343();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer110();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer315();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer160();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        kryoSerializer6.initialized = true;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer104();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer81();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer186();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer221();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer201();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer339();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer282();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer12();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer124();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer356();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer403();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer41();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer98();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer261();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer396();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer138();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer30();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer306();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer86();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.DataOutput dataOutput13 = kryoSerializer10.getDataOutput(256, false);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(dataOutput13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer271();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer187();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer123();
        java.lang.ThreadLocal<com.esotericsoftware.kryo.Kryo> kryoThreadLocal11 = kryoSerializer10.kryos;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoThreadLocal11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer43();
        com.esotericsoftware.kryo.Kryo kryo6 = kryoSerializer5.getKryo();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryo6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer73();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer22();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer22();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer401();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer318();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer194();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer293();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer284();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer199();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer369();
        kryoSerializer7.initialized = false;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer132();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer186();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer163();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer17();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer388();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer41();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer41();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer30();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer376();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer309();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer83();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer86();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer367();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer204();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer346();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer58();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer144();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer148();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer258();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer15();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer159();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer179();
        kryoSerializer11.setinitialized(true);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer85();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer227();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer49();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer281();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer292();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer126();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer404();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer226();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer57();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer51();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer362();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer252();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer283();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer401();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization serializerInitialization0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter1 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter1.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter1.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter1.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter1.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter1.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter1.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter1.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter1.deserializeObjectKryoSerializer291();
        serializerInitialization0.serializedObjectSupporter = serializedObjectSupporter1;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter1.deserializeObjectKryoSerializer257();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter1.deserializeObjectKryoSerializer129();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter1.deserializeObjectKryoSerializer198();
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer207();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer261();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer396();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer293();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer4();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer301();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer10();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer96();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer376();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer386();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer346();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer326();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer206();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer94();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer27();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer272();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer157();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer192();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer190();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer289();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer27();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer348();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        boolean boolean4 = kryoSerializer3.getinitialized();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer223();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer382();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer214();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer229();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer324();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer367();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer195();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer224();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer317();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer132();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer113();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer284();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer403();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer83();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer188();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        boolean boolean7 = kryoSerializer6.getregisterRequired();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer355();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer110();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer71();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer256();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer17();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer407();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer371();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer85();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer62();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer129();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer113();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer284();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer399();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer179();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer399();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer353();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer343();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer29();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer3();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer221();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer284();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer144();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer294();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer271();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer62();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer181();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer157();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer274();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        com.esotericsoftware.kryo.Serializer serializer7 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration8 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer7);
        com.esotericsoftware.kryo.Serializer serializer9 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration10 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer9);
        java.lang.Class class11 = typeRegistration10.gettype();
        java.lang.Class class12 = typeRegistration10.gettype();
        com.esotericsoftware.kryo.Serializer serializer13 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration14 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class12, serializer13);
        com.esotericsoftware.kryo.Serializer serializer15 = typeRegistration14.getserializer();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNull(serializer15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer349();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer360();
        int int8 = kryoSerializer7.getMAX_OUTPUT_SIZE();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10485760 + "'", int8 == 10485760);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer358();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer311();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer202();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer129();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer391();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer267();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer368();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer323();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer336();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer186();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer295();
        kryoSerializer6.setinitialized(false);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer273();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer104();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer20();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer348();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer124();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer225();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer74();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer326();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer369();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer184();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer57();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer51();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer143();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer62();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer297();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer401();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer10();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer45();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer186();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer29();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer400();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer377();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer172();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer5();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer378();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer377();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer40();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer57();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer117();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer349();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer315();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer410();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer160();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer314();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer368();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer51();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer217();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer86();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer120();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer372();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer180();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer162();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer302();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer391();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer65();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer388();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer373();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer254();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer330();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer110();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer114();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer353();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer343();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer198();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer358();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer311();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer279();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer407();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer76();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer9();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer119();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer187();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer190();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer289();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer27();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer279();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer100();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer257();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer250();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer308();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer154();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer28();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer138();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer51();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer8();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer240();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer98();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer96();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer157();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer113();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer229();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer198();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer115();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer312();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer181();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer3();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer217();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer93();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer143();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer407();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer76();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer267();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer279();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer195();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer253();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer396();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer293();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer382();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer14();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        com.esotericsoftware.kryo.Serializer serializer7 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration8 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer7);
        com.esotericsoftware.kryo.Serializer serializer9 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration10 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer9);
        java.lang.Class class11 = typeRegistration10.gettype();
        com.esotericsoftware.kryo.Serializer serializer12 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration13 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class11, serializer12);
        com.esotericsoftware.kryo.Serializer serializer14 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration15 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class11, serializer14);
        java.lang.Class class16 = typeRegistration15.gettype();
        com.esotericsoftware.kryo.Serializer serializer17 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration18 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class16, serializer17);
        com.esotericsoftware.kryo.Serializer serializer19 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration20 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class16, serializer19);
        com.esotericsoftware.kryo.Serializer serializer21 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration22 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class16, serializer21);
        com.esotericsoftware.kryo.Serializer serializer23 = typeRegistration22.getserializer();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNull(serializer23);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer312();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer15();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer209();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer229();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer243();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer258();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer86();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer341();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer288();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
        org.junit.Assert.assertNotNull(kryoSerializer14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer180();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer158();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer353();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer138();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer110();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer38();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer265();
        boolean boolean3 = kryoSerializer2.registerRequired;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer253();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer398();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer154();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer199();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer274();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer126();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer349();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer403();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer376();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer309();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer262();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer65();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer237();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer170();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer164();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer67();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer74();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer326();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer369();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer198();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer393();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer342();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer361();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer206();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer98();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer298();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer67();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer15();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer86();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer212();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer253();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer360();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer41();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer41();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer276();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer360();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter4 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter4.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter4.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter4.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter4.deserializeObjectKryoSerializer60();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter4.deserializeObjectKryoSerializer64();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter10 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter10.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter10.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter10.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter10.deserializeObjectKryoSerializer346();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer15 = serializedObjectSupporter10.deserializeObjectKryoSerializer225();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter16 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer17 = serializedObjectSupporter16.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer18 = serializedObjectSupporter16.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer19 = serializedObjectSupporter16.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer20 = serializedObjectSupporter16.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer21 = serializedObjectSupporter16.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer22 = serializedObjectSupporter16.deserializeObjectKryoSerializer74();
        com.esotericsoftware.kryo.Kryo kryo23 = kryoSerializer22.getKryo();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter24 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer25 = serializedObjectSupporter24.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer26 = serializedObjectSupporter24.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer27 = serializedObjectSupporter24.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer28 = serializedObjectSupporter24.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer29 = serializedObjectSupporter24.deserializeObjectKryoSerializer23();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer30 = serializedObjectSupporter24.deserializeObjectKryoSerializer73();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer31 = serializedObjectSupporter24.deserializeObjectKryoSerializer267();
        boolean boolean32 = kryoSerializer15.isValidObject(kryo23, (java.lang.Object) kryoSerializer31);
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter33 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer34 = serializedObjectSupporter33.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer35 = serializedObjectSupporter33.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer36 = serializedObjectSupporter33.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer37 = serializedObjectSupporter33.deserializeObjectKryoSerializer405();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer38 = serializedObjectSupporter33.deserializeObjectKryoSerializer121();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer39 = serializedObjectSupporter33.deserializeObjectKryoSerializer51();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer40 = serializedObjectSupporter33.deserializeObjectKryoSerializer359();
        boolean boolean41 = kryoSerializer9.isValidObject(kryo23, (java.lang.Object) kryoSerializer40);
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter42 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer43 = serializedObjectSupporter42.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer44 = serializedObjectSupporter42.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer45 = serializedObjectSupporter42.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer46 = serializedObjectSupporter42.deserializeObjectKryoSerializer405();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer47 = serializedObjectSupporter42.deserializeObjectKryoSerializer121();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer48 = serializedObjectSupporter42.deserializeObjectKryoSerializer337();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer49 = serializedObjectSupporter42.deserializeObjectKryoSerializer200();
        boolean boolean50 = kryoSerializer3.isValidObject(kryo23, (java.lang.Object) serializedObjectSupporter42);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
        org.junit.Assert.assertNotNull(kryoSerializer14);
        org.junit.Assert.assertNotNull(kryoSerializer15);
        org.junit.Assert.assertNotNull(kryoSerializer17);
        org.junit.Assert.assertNotNull(kryoSerializer18);
        org.junit.Assert.assertNotNull(kryoSerializer19);
        org.junit.Assert.assertNotNull(kryoSerializer20);
        org.junit.Assert.assertNotNull(kryoSerializer21);
        org.junit.Assert.assertNotNull(kryoSerializer22);
        org.junit.Assert.assertNotNull(kryo23);
        org.junit.Assert.assertNotNull(kryoSerializer25);
        org.junit.Assert.assertNotNull(kryoSerializer26);
        org.junit.Assert.assertNotNull(kryoSerializer27);
        org.junit.Assert.assertNotNull(kryoSerializer28);
        org.junit.Assert.assertNotNull(kryoSerializer29);
        org.junit.Assert.assertNotNull(kryoSerializer30);
        org.junit.Assert.assertNotNull(kryoSerializer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(kryoSerializer34);
        org.junit.Assert.assertNotNull(kryoSerializer35);
        org.junit.Assert.assertNotNull(kryoSerializer36);
        org.junit.Assert.assertNotNull(kryoSerializer37);
        org.junit.Assert.assertNotNull(kryoSerializer38);
        org.junit.Assert.assertNotNull(kryoSerializer39);
        org.junit.Assert.assertNotNull(kryoSerializer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(kryoSerializer43);
        org.junit.Assert.assertNotNull(kryoSerializer44);
        org.junit.Assert.assertNotNull(kryoSerializer45);
        org.junit.Assert.assertNotNull(kryoSerializer46);
        org.junit.Assert.assertNotNull(kryoSerializer47);
        org.junit.Assert.assertNotNull(kryoSerializer48);
        org.junit.Assert.assertNotNull(kryoSerializer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer293();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer284();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer199();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer369();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer393();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer323();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer298();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer254();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer79();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer85();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer224();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer218();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer157();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer96();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer391();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer10();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer243();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer362();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer123();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer76();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer185();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer383();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer100();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer224();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer93();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer361();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer323();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer298();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer311();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer143();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer135();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer206();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer244();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer210();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer288();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer264();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer291();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer86();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer341();
        kryoSerializer11.initialized = true;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer315();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer160();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer241();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer345();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer156();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer388();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer308();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer190();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer289();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer27();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer329();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer165();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer98();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer11();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer79();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer230();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer155();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer26();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer41();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer41();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer240();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer266();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer366();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer147();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer371();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer307();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer159();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        com.esotericsoftware.kryo.Serializer serializer7 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration8 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer7);
        com.esotericsoftware.kryo.Serializer serializer9 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration10 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer9);
        com.esotericsoftware.kryo.Serializer serializer11 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration12 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer11);
        java.lang.Class class13 = typeRegistration12.type;
        com.esotericsoftware.kryo.Serializer serializer14 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration15 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class13, serializer14);
        com.esotericsoftware.kryo.Serializer serializer16 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration17 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class13, serializer16);
        com.esotericsoftware.kryo.Serializer serializer18 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration19 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class13, serializer18);
        com.esotericsoftware.kryo.Serializer serializer20 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration21 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class13, serializer20);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer186();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer29();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer133();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer49();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer32();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer184();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer70();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer220();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization serializerInitialization0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter1 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter1.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter1.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter1.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter1.deserializeObjectKryoSerializer300();
        serializerInitialization0.serializedObjectSupporter = serializedObjectSupporter1;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter1.deserializeObjectKryoSerializer316();
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer56();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer15();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer396();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer312();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer181();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer114();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer143();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer398();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter6 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter6.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter6.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter6.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter6.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter6.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter6.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter6.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter6.deserializeObjectKryoSerializer210();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer15 = serializedObjectSupporter6.deserializeObjectKryoSerializer288();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer16 = serializedObjectSupporter6.deserializeObjectKryoSerializer264();
        com.esotericsoftware.kryo.Kryo kryo17 = kryoSerializer16.getKryo();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter18 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer19 = serializedObjectSupporter18.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer20 = serializedObjectSupporter18.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer21 = serializedObjectSupporter18.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer22 = serializedObjectSupporter18.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer23 = serializedObjectSupporter18.deserializeObjectKryoSerializer57();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer24 = serializedObjectSupporter18.deserializeObjectKryoSerializer51();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer25 = serializedObjectSupporter18.deserializeObjectKryoSerializer326();
        boolean boolean26 = kryoSerializer5.isValidObject(kryo17, (java.lang.Object) serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
        org.junit.Assert.assertNotNull(kryoSerializer14);
        org.junit.Assert.assertNotNull(kryoSerializer15);
        org.junit.Assert.assertNotNull(kryoSerializer16);
        org.junit.Assert.assertNotNull(kryo17);
        org.junit.Assert.assertNotNull(kryoSerializer19);
        org.junit.Assert.assertNotNull(kryoSerializer20);
        org.junit.Assert.assertNotNull(kryoSerializer21);
        org.junit.Assert.assertNotNull(kryoSerializer22);
        org.junit.Assert.assertNotNull(kryoSerializer23);
        org.junit.Assert.assertNotNull(kryoSerializer24);
        org.junit.Assert.assertNotNull(kryoSerializer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer393();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer324();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer264();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer362();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer227();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer355();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer115();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer301();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer124();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer403();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer3();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter11 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter11.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter11.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter11.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer15 = serializedObjectSupporter11.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer16 = serializedObjectSupporter11.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer17 = serializedObjectSupporter11.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer18 = serializedObjectSupporter11.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer19 = serializedObjectSupporter11.deserializeObjectKryoSerializer210();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer20 = serializedObjectSupporter11.deserializeObjectKryoSerializer288();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer21 = serializedObjectSupporter11.deserializeObjectKryoSerializer264();
        com.esotericsoftware.kryo.Kryo kryo22 = kryoSerializer21.getKryo();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter23 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer24 = serializedObjectSupporter23.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer25 = serializedObjectSupporter23.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer26 = serializedObjectSupporter23.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer27 = serializedObjectSupporter23.deserializeObjectKryoSerializer60();
        boolean boolean28 = kryoSerializer10.isValidObject(kryo22, (java.lang.Object) serializedObjectSupporter23);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
        org.junit.Assert.assertNotNull(kryoSerializer14);
        org.junit.Assert.assertNotNull(kryoSerializer15);
        org.junit.Assert.assertNotNull(kryoSerializer16);
        org.junit.Assert.assertNotNull(kryoSerializer17);
        org.junit.Assert.assertNotNull(kryoSerializer18);
        org.junit.Assert.assertNotNull(kryoSerializer19);
        org.junit.Assert.assertNotNull(kryoSerializer20);
        org.junit.Assert.assertNotNull(kryoSerializer21);
        org.junit.Assert.assertNotNull(kryo22);
        org.junit.Assert.assertNotNull(kryoSerializer24);
        org.junit.Assert.assertNotNull(kryoSerializer25);
        org.junit.Assert.assertNotNull(kryoSerializer26);
        org.junit.Assert.assertNotNull(kryoSerializer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer148();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer126();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer35();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer57();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer51();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer326();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer210();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer288();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer262();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer168();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer38();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer113();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer216();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer11();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer185();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer104();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer184();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer382();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer252();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        java.lang.Class<?> wildcardClass5 = kryoSerializer4.getClass();
        com.esotericsoftware.kryo.Serializer serializer6 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration7 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass5, serializer6);
        com.esotericsoftware.kryo.Serializer serializer8 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration9 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass5, serializer8);
        com.esotericsoftware.kryo.Serializer serializer10 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration11 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass5, serializer10);
        java.lang.Class class12 = typeRegistration11.gettype();
        com.esotericsoftware.kryo.Serializer serializer13 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration14 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class12, serializer13);
        com.esotericsoftware.kryo.Serializer serializer15 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration16 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class12, serializer15);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer270();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer320();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer191();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer367();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer326();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer277();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer72();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer231();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer320();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer167();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer220();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer28();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer194();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer19();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer258();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer388();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer63();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer50();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer180();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer162();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer105();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization serializerInitialization0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter1 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter1.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter1.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter1.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter1.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter1.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter1.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter1.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter1.deserializeObjectKryoSerializer291();
        serializerInitialization0.serializedObjectSupporter = serializedObjectSupporter1;
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter11 = serializerInitialization0.serializedObjectSupporter;
        int int12 = serializerInitialization0.getKRYO_OFFSET();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter13 = serializerInitialization0.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(serializedObjectSupporter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(serializedObjectSupporter13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer303();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer346();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer353();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer343();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer388();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer233();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer388();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer349();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization serializerInitialization0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization();
        int int1 = serializerInitialization0.getRESERVED_ID_OFFSET();
        int int2 = serializerInitialization0.getKRYO_OFFSET();
        int int3 = serializerInitialization0.getKRYO_OFFSET();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40 + "'", int3 == 40);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer183();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer85();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        java.lang.ThreadLocal<com.esotericsoftware.kryo.Kryo> kryoThreadLocal9 = kryoSerializer8.getkryos();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoThreadLocal9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer104();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer369();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer230();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer181();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer177();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer56();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer52();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer367();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer75();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer32();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer10();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer307();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer43();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer323();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer298();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer43();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer261();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer85();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer179();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer49();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer343();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer118();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer293();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer284();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer258();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer258();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer8();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer321();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer8();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer127();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer56();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer181();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer157();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer8();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer98();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer298();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer410();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer291();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer274();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer5();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer170();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer405();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer115();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer187();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer125();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer229();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer324();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer351();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer387();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer366();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer20();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer391();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer65();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer223();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer156();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer92();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer110();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer338();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer377();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer40();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer5();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer24();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        java.lang.Class<?> wildcardClass5 = kryoSerializer4.getClass();
        com.esotericsoftware.kryo.Serializer serializer6 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration7 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass5, serializer6);
        com.esotericsoftware.kryo.Serializer serializer8 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration9 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass5, serializer8);
        com.esotericsoftware.kryo.Serializer serializer10 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration11 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass5, serializer10);
        java.lang.Class class12 = typeRegistration11.gettype();
        com.esotericsoftware.kryo.Serializer serializer13 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration14 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class12, serializer13);
        java.lang.Class class15 = typeRegistration14.type;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer3();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer292();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer81();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer119();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer264();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer116();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer153();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter0.deserializeObjectKryoSerializer391();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer15 = serializedObjectSupporter0.deserializeObjectKryoSerializer251();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
        org.junit.Assert.assertNotNull(kryoSerializer14);
        org.junit.Assert.assertNotNull(kryoSerializer15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer288();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer369();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer5();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer341();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer35();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization serializerInitialization0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter1 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter1.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter1.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter1.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter1.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter1.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter1.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter1.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter1.deserializeObjectKryoSerializer291();
        serializerInitialization0.serializedObjectSupporter = serializedObjectSupporter1;
        int int11 = serializerInitialization0.getRESERVED_ID_OFFSET();
        int int12 = serializerInitialization0.getRESERVED_ID_OFFSET();
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 256 + "'", int11 == 256);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 256 + "'", int12 == 256);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer390();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer264();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer368();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer294();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer83();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer120();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer382();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer367();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer85();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer227();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer376();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer393();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer407();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer76();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer127();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer308();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer168();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer114();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer15();
        boolean boolean7 = kryoSerializer6.getregisterRequired();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer12();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer209();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer202();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer181();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer291();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer273();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer165();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer85();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer202();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer296();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer302();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer379();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer217();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer319();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer339();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer405();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer121();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer51();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer22();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer56();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer338();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer355();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer132();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer362();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer252();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer243();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer157();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer241();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer117();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer127();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer8();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer377();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer412();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer137();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer297();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer167();
        int int8 = kryoSerializer7.getMAX_OUTPUT_SIZE();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10485760 + "'", int8 == 10485760);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer157();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer241();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer349();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer303();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer91();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer312();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer181();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer163();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer201();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer157();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer11();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer358();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer311();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer351();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer372();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer410();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer383();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer58();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer377();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer172();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer158();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        kryoSerializer7.setinitialized(true);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter5 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter5.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter5.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter5.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter5.deserializeObjectKryoSerializer134();
        com.esotericsoftware.kryo.Kryo kryo10 = kryoSerializer9.getKryo();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter11 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter11.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter11.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter11.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer15 = serializedObjectSupporter11.deserializeObjectKryoSerializer196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer16 = serializedObjectSupporter11.deserializeObjectKryoSerializer355();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer17 = serializedObjectSupporter11.deserializeObjectKryoSerializer132();
        boolean boolean18 = kryoSerializer4.isValidObject(kryo10, (java.lang.Object) kryoSerializer17);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryo10);
        org.junit.Assert.assertNotNull(kryoSerializer12);
        org.junit.Assert.assertNotNull(kryoSerializer13);
        org.junit.Assert.assertNotNull(kryoSerializer14);
        org.junit.Assert.assertNotNull(kryoSerializer15);
        org.junit.Assert.assertNotNull(kryoSerializer16);
        org.junit.Assert.assertNotNull(kryoSerializer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer243();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer381();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer256();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer354();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer74();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer326();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer388();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer382();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer233();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer146();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer269();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer52();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer297();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer195();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer255();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer104();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer337();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer271();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer274();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer409();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer377();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer331();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer172();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer205();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer94();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization serializerInitialization0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter1 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter1.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter1.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter1.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter1.deserializeObjectKryoSerializer300();
        serializerInitialization0.serializedObjectSupporter = serializedObjectSupporter1;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter1.deserializeObjectKryoSerializer67();
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        boolean boolean4 = kryoSerializer3.initialized;
        java.lang.Class<?> wildcardClass5 = kryoSerializer3.getClass();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer358();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer311();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer351();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer372();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer18();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer190();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer69();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer390();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer264();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer185();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer73();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        boolean boolean8 = kryoSerializer7.initialized;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer43();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer167();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer382();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization serializerInitialization0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter1 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter1.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter1.deserializeObjectKryoSerializer6();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter1.deserializeObjectKryoSerializer352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter1.deserializeObjectKryoSerializer300();
        serializerInitialization0.serializedObjectSupporter = serializedObjectSupporter1;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter1.deserializeObjectKryoSerializer307();
        int int8 = kryoSerializer7.getMAX_OUTPUT_SIZE();
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10485760 + "'", int8 == 10485760);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer222();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer74();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer326();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer388();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer87();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer34();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer413();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer240();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer391();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer226();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer151();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer85();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer227();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer46();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer119();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer286();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer219();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer127();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer39();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer7();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        com.esotericsoftware.kryo.Serializer serializer7 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration8 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer7);
        com.esotericsoftware.kryo.Serializer serializer9 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration10 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer9);
        com.esotericsoftware.kryo.Serializer serializer11 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration12 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer11);
        java.lang.Class class13 = typeRegistration12.type;
        com.esotericsoftware.kryo.Serializer serializer14 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration15 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class13, serializer14);
        com.esotericsoftware.kryo.Serializer serializer16 = typeRegistration15.serializer;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNull(serializer16);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer150();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer160();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer300();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer127();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer90();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer142();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer391();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer65();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer223();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer25();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer43();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer221();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer237();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer125();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer250();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer332();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer335();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer16();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        com.esotericsoftware.kryo.Serializer serializer7 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration8 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer7);
        com.esotericsoftware.kryo.Serializer serializer9 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration10 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass6, serializer9);
        java.lang.Class class11 = typeRegistration10.gettype();
        com.esotericsoftware.kryo.Serializer serializer12 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration13 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class11, serializer12);
        com.esotericsoftware.kryo.Serializer serializer14 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration15 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration(class11, serializer14);
        java.lang.Class class16 = typeRegistration15.gettype();
        com.esotericsoftware.kryo.Serializer serializer17 = typeRegistration15.getserializer();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNull(serializer17);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer21();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer362();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer123();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer48();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer101();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer54();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer12();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer393();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer241();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer402();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer44();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer37();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer263();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer334();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer405();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer215();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer299();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer70();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer190();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer289();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer27();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer359();
        com.google.common.cache.Cache<java.lang.Class<?>, java.lang.Boolean> wildcardClassCache7 = kryoSerializer6.getobjectVerificationCache();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(wildcardClassCache7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer370();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer159();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer326();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }
}

