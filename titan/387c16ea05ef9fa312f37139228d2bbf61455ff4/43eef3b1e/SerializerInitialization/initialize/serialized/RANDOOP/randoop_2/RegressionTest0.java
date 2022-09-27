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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1696();
        com.google.common.cache.Cache<java.lang.Class<?>, java.lang.Boolean> wildcardClassCache5 = kryoSerializer4.getobjectVerificationCache();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(wildcardClassCache5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        boolean boolean4 = kryoSerializer3.getinitialized();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1658();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer990();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer96();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1314();
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1822();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1470();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1810();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1079();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1577();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1751();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1670();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer746();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer515();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1408();
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1451();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer253();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1772();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer279();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer957();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1721();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1582();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1372();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer909();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer569();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer622();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer103();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1569();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1815();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer721();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer480();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1121();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1203();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1151();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1266();
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1345();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer276();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1470();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1810();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer169();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer38();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer642();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer59();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer950();
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1735();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1565();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1132();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer518();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer534();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1603();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1494();
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
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer832();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1773();
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1647();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer619();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer598();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1366();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer336();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1696();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer733();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1565();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer984();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer905();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1522();
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1693();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.google.common.cache.Cache<java.lang.Class<?>, java.lang.Boolean> wildcardClassCache5 = kryoSerializer4.objectVerificationCache;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(wildcardClassCache5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer850();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer668();
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1050();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1284();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1720();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer743();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer925();
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer814();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1746();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer11();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer897();
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1470();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1810();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer950();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1231();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer804();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1301();
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1562();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer756();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer591();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer63();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer689();
        com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.initialize((com.thinkaurelius.titan.graphdb.database.serialize.Serializer) kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer775();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer261();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1088();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1648();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer642();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1346();
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer621();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer530();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1693();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1715();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer420();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1772();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1553();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer97();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1658();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer500();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.thinkaurelius.titan.diskstorage.StaticBuffer.Factory<com.esotericsoftware.kryo.io.Input> inputFactory0 = com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.INPUT_FACTORY;
        org.junit.Assert.assertNotNull(inputFactory0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer598();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1605();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer290();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer665();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer746();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer515();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer203();
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1707();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer426();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer706();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer675();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1201();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1720();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer743();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1658();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer731();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer357();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer704();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1509();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer191();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer825();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1678();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer809();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer38();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1007();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        boolean boolean5 = kryoSerializer4.initialized;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer426();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer706();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer675();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer687();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer762();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1294();
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer273();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1474();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1718();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer621();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer256();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1660();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer426();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1566();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1721();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer670();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1451();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer854();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1755();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer572();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1205();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer989();
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer139();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1776();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer567();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1354();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1231();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer545();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1289();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer880();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer889();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer795();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer674();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer839();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer689();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1008();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer68();
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1658();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1799();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1205();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1354();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1731();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1764();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1383();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer635();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer552();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer949();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1180();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer453();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer279();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer693();
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer231();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer327();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1682();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1112();
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1394();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1741();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer645();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1589();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1088();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1802();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1354();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1231();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer545();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1699();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1641();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer940();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1141();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1426();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer426();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer883();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer522();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1409();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer836();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer59();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer950();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer100();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1570();
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer420();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1185();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1079();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1617();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1511();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1647();
        com.google.common.cache.Cache<java.lang.Class<?>, java.lang.Boolean> wildcardClassCache3 = kryoSerializer2.objectVerificationCache;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(wildcardClassCache3);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1720();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer483();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer825();
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer49();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer358();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1079();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1377();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer847();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer18();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1799();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer865();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer895();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1658();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1512();
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer725();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer49();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer60();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1553();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer225();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1262();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer813();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer457();
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer725();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer518();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1565();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1307();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer298();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer357();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1454();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1657();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1716();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer569();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1371();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1764();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer995();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer191();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer839();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1658();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1039();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer701();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer525();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1585();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1047();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1029();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1553();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer572();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer485();
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1716();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer846();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1470();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1709();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer127();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1286();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer420();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1360();
        java.util.Map<java.lang.Integer, com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration> intMap4 = kryoSerializer3.getregistrations();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(intMap4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer612();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1799();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1716();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer9();
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1642();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1114();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer138();
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer463();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1605();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1221();
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer910();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1088();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1252();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1517();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer563();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer829();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer450();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer285();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1495();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1195();
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer945();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer957();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer608();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1256();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer721();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1760();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1203();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer896();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer385();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer352();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1555();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer433();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer156();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1434();
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer45();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1727();
        kryoSerializer4.initialized = true;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer114();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1785();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1555();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer33();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1125();
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1035();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer773();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer896();
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1128();
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer9();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer701();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer647();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer330();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer762();
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer704();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer997();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer795();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1542();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer316();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1764();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1518();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1008();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer880();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1262();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer553();
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer45();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer818();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer957();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1394();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1331();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer453();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer279();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer670();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer948();
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1624();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1341();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1217();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer704();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer997();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer442();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1696();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1492();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1291();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer426();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer614();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1779();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1613();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer534();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1603();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer842();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer712();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1347();
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer572();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer9();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer294();
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer357();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1251();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1284();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1470();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1568();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer848();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer693();
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1716();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer9();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer197();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer694();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer14();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer241();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1434();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1061();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer338();
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1647();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer619();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1790();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer330();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer620();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1724();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer878();
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1658();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1000();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer227();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1469();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1658();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer160();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1054();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer735();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer339();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1079();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1500();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1696();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer907();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1079();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1617();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1058();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer643();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1093();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1523();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer874();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer560();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int int0 = com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.MAX_OUTPUT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10485760 + "'", int0 == 10485760);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer420();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer812();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer4();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer909();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer208();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer835();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer96();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer646();
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1035();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer481();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1252();
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer558();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer847();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1054();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1333();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1400();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1296();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1245();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer449();
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1488();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer817();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1424();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1446();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer206();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer698();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer663();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer463();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1682();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer59();
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1354();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1090();
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer767();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer750();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer389();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer211();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer483();
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1721();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer522();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1721();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1582();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1372();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer909();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer66();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1635();
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1144();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer475();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer279();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1054();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1354();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer31();
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1721();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer426();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer706();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer675();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1156();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer697();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer259();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1178();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1815();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer175();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer158();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer725();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1155();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1040();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1469();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1716();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer726();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1098();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1235();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer660();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer611();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1471();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1477();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1395();
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1006();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1657();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer225();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer82();
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1647();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer51();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer572();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1205();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer116();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer363();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer945();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter0.deserializeObjectKryoSerializer64();
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer747();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1164();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1725();
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer591();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1651();
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer643();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer129();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1040();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1750();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1679();
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer767();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer674();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer36();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer528();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer174();
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1589();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer165();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1707();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer365();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer945();
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer330();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1803();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1114();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1276();
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1527();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer896();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1279();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer18();
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1079();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer183();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer954();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer725();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer917();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1163();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer52();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1256();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer339();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1808();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1310();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer463();
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer139();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1042();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer911();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1488();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer762();
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1328();
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer180();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1561();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer312();
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1345();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1347();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer139();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1292();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1650();
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1035();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer481();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1165();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer390();
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1641();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer759();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1641();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1447();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1509();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer719();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer909();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1693();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1537();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1720();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer743();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer464();
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1642();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1421();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer648();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer1375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter0.deserializeObjectKryoSerializer693();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer15 = serializedObjectSupporter0.deserializeObjectKryoSerializer1678();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer16 = serializedObjectSupporter0.deserializeObjectKryoSerializer165();
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
        org.junit.Assert.assertNotNull(kryoSerializer16);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1642();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1421();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer1342();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer790();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter0.deserializeObjectKryoSerializer1660();
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1574();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1585();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1047();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer544();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer280();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1782();
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1354();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1231();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer743();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1740();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1007();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1240();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer835();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int int0 = com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization.KRYO_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40 + "'", int0 == 40);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1088();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1167();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer480();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer273();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer902();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1589();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer226();
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1716();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer569();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer414();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer621();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer256();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer298();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1617();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer755();
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer231();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer125();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1277();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1657();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer734();
        com.esotericsoftware.kryo.Kryo kryo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = kryoSerializer12.isValidObject(kryo13, (java.lang.Object) (short) 1);
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
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertNotNull(kryoSerializer10);
        org.junit.Assert.assertNotNull(kryoSerializer11);
        org.junit.Assert.assertNotNull(kryoSerializer12);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer821();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer120();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer62();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer829();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer627();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer367();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1752();
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer27();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1706();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer757();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer949();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer646();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer814();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer551();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer948();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer644();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1471();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1477();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer607();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1798();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1429();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer643();
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer259();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1099();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1641();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer494();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer462();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer627();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1100();
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer560();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1574();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer901();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer591();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1063();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer426();
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1471();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1477();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer607();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1798();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer583();
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1648();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer642();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer539();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1790();
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1473();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer191();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1653();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer28();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1639();
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer112();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1282();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1095();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer571();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer980();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1072();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer282();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1309();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer1689();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer673();
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1396();
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer643();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1093();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer475();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1513();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer816();
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer969();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer563();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer441();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer703();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1735();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1034();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer238();
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer817();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer39();
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1240();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1589();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1675();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1570();
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1155();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer726();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer833();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1804();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1658();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1799();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1205();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer193();
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1434();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1496();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer622();
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1642();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1421();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer1342();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer1472();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter0.deserializeObjectKryoSerializer32();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer15 = serializedObjectSupporter0.deserializeObjectKryoSerializer803();
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1475();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer655();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1790();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1688();
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1123();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer728();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer480();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1187();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer187();
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1706();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1022();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1533();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer290();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1497();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer108();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1345();
        java.lang.Class<?> wildcardClass5 = kryoSerializer4.getClass();
        com.esotericsoftware.kryo.Serializer serializer6 = null;
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration typeRegistration7 = new com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer.TypeRegistration((java.lang.Class) wildcardClass5, serializer6);
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1008();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1684();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer567();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer827();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1585();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer404();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1079();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1281();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer605();
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer643();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1293();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer480();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1468();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1741();
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer643();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1093();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer498();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer273();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer680();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1224();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer906();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer11();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer160();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer866();
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1721();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1582();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1372();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer909();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer66();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1594();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer231();
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer480();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1468();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer476();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer240();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1519();
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer701();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer497();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer764();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1711();
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1054();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1333();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1400();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer212();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1551();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer43();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer701();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer62();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1528();
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer704();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer997();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer442();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1174();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1815();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer175();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer158();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer938();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer688();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1389();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1155();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer904();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1814();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1371();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer232();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer782();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer445();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1325();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer292();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer725();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1366();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1674();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1201();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer436();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1036();
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1721();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1582();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1372();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer909();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1616();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1585();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1047();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer544();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1766();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer574();
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1054();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer735();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer742();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer457();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer574();
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1555();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer433();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer156();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1616();
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer14();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer894();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer282();
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1642();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1421();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer648();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer1375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter0.deserializeObjectKryoSerializer1045();
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer612();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1282();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer893();
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1471();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1477();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer533();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer781();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer180();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer729();
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer847();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer931();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1760();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer246();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer689();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer814();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1630();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1528();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1296();
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1565();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer984();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1103();
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer273();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer106();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1196();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer664();
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1585();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer404();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1621();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1671();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer802();
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1014();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer457();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer351();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer420();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1185();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer924();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1256();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1664();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1393();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1184();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1500();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1696();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer537();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1721();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1582();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1372();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer909();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer66();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1594();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1468();
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1565();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1401();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer543();
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1565();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer934();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1488();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer405();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer745();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1252();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer999();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer548();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer191();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1653();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1533();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer611();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer279();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer518();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer512();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1564();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer977();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer671();
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1541();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1634();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1206();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer336();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1790();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1055();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1705();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1544();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1564();
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1366();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1674();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1201();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer814();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer551();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1235();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1792();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1509();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer719();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1818();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1423();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1809();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer995();
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1054();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1333();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1400();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer453();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1363();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer509();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer42();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer887();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1800();
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer847();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1545();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1054();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1333();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1400();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer212();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1551();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1366();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer861();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1411();
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer282();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer589();
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer643();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer129();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1374();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer485();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer357();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1251();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer59();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1700();
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1005();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer192();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer70();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1681();
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer282();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1309();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer1192();
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer969();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1345();
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer534();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer412();
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1696();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1355();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer902();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1492();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer617();
        int int10 = kryoSerializer9.getMAX_OUTPUT_SIZE();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
        org.junit.Assert.assertNotNull(kryoSerializer8);
        org.junit.Assert.assertNotNull(kryoSerializer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10485760 + "'", int10 == 10485760);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer699();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer740();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer996();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer59();
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1282();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1095();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer182();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer821();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer306();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer571();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1720();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer506();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1011();
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer420();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer812();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer4();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer909();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer208();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer912();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1695();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1678();
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer572();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer546();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer884();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer539();
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer420();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer122();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer130();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer821();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer306();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1607();
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1366();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1674();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1183();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer924();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1605();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1762();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1555();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer433();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer844();
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1488();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer524();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1289();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1283();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer483();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer471();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer69();
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1669();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer333();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer11();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer790();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1337();
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer924();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1008();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1041();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer95();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer353();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1589();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1125();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1345();
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1558();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1030();
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1751();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer832();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer550();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer480();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer89();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1176();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1187();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1604();
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer485();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer717();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1548();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1670();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1152();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer852();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer111();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer848();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer890();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer327();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer572();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer170();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer281();
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer480();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer52();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1470();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1810();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1657();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer143();
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1354();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1704();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer865();
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1170();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1555();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer433();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer604();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1114();
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1657();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer734();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer564();
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1741();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer59();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer216();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer366();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer480();
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer139();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1169();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1140();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1735();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1034();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1285();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1102();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer669();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1424();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer395();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer635();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer169();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1750();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1041();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1097();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer273();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer751();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer644();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer290();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer745();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1471();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1477();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer607();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer928();
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer832();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer956();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1577();
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer429();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1078();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1565();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1401();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1027();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer751();
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1109();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1256();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1664();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer133();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1470();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1810();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1079();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1012();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1552();
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer304();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer661();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer426();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1134();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer614();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1779();
        com.google.common.cache.Cache<java.lang.Class<?>, java.lang.Boolean> wildcardClassCache7 = kryoSerializer6.objectVerificationCache;
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(wildcardClassCache7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1262();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer813();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1035();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer961();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1805();
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer231();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer125();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer230();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer495();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer768();
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer821();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1513();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1533();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1451();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1592();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1587();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1624();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer873();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer588();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1745();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer896();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer385();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer270();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1194();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1029();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer49();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1247();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer120();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer330();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1803();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1114();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1509();
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer572();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer546();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer538();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer292();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1441();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer621();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer256();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer298();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1480();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer400();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1011();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer453();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer991();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer124();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer306();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1509();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer995();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer861();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer365();
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer612();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer115();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer213();
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1471();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1477();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer607();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1798();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer922();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer340();
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1354();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1050();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer704();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer997();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer178();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1641();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer494();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer245();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1530();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1511();
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1243();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer832();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer956();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1276();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1410();
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1366();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1674();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer350();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1201();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer436();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer618();
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer99();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer63();
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer344();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1029();
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer832();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer956();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1260();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1325();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer459();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer1635();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer1115();
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1548();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer234();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer445();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer642();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer860();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer236();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer1508();
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer268();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer292();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1690();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1717();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1789();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer534();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer685();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1246();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1408();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1589();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer23();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1472();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1599();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer969();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer27();
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer572();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1205();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer394();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer116();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer363();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer945();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer14 = serializedObjectSupporter0.deserializeObjectKryoSerializer104();
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1565();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer984();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer905();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1722();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer384();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer672();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer2();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer13 = serializedObjectSupporter0.deserializeObjectKryoSerializer1699();
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer576();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1424();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1716();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1074();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer643();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer129();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1352();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1815();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer175();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer230();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1816();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1075();
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1741();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer59();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1051();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1354();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1182();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer421();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1141();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1510();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1345();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer802();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1774();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1352();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1720();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer743();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer783();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer1153();
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer435();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1597();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer737();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer516();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer275();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer282();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer875();
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1465();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer531();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1799();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer191();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1805();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1233();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer746();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1301();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1705();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer559();
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1644();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1398();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1105();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer139();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1042();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer136();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer911();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1488();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer698();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer12 = serializedObjectSupporter0.deserializeObjectKryoSerializer1496();
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer328();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1394();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1108();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1817();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer420();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer812();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer4();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer909();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1399();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1364();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer423();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1676();
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1553();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1219();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer969();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer13();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer93();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer493();
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer380();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1659();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1214();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1475();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer655();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1790();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer708();
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer662();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer61();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1738();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1434();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer107();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1496();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1170();
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1054();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1333();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1400();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1296();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer930();
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer420();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1360();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1782();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer461();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer850();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer589();
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer361();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1470();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1194();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer162();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer649();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer782();
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1589();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1667();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer330();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer979();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer280();
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1303();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer392();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer305();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer918();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1468();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1176();
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1565();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer984();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer905();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer33();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1327();
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer521();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer191();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1653();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1798();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer732();
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
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer53();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer865();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer634();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
        org.junit.Assert.assertNotNull(kryoSerializer7);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer968();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1138();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer47();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1229();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1447();
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer180();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1245();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1505();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1252();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1015();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1611();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1065();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1470();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1810();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer77();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer624();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1334();
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1504();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer778();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1348();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer709();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1200();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1313();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer572();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer546();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer10 = serializedObjectSupporter0.deserializeObjectKryoSerializer1397();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer11 = serializedObjectSupporter0.deserializeObjectKryoSerializer74();
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1815();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer175();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer831();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1544();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer791();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer843();
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1416();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer606();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1488();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer405();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1393();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer593();
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer375();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer892();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer824();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1295();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1555();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer433();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer128();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1614();
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1155();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer904();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer229();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer22();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer723();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer171();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1484();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer485();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer717();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1054();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer1145();
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer483();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer689();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer1822();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer1583();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer9 = serializedObjectSupporter0.deserializeObjectKryoSerializer262();
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer1514();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1503();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer14();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1389();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer955();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer1162();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer1287();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer1748();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer489();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1668();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer746();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer7 = serializedObjectSupporter0.deserializeObjectKryoSerializer515();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer8 = serializedObjectSupporter0.deserializeObjectKryoSerializer698();
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer626();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer874();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer79();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1601();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer888();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter serializedObjectSupporter0 = new com.thinkaurelius.titan.graphdb.database.serialize.SerializedObjectSupporter();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer1 = serializedObjectSupporter0.deserializeObjectKryoSerializer424();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer2 = serializedObjectSupporter0.deserializeObjectKryoSerializer248();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer3 = serializedObjectSupporter0.deserializeObjectKryoSerializer704();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer4 = serializedObjectSupporter0.deserializeObjectKryoSerializer1695();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer5 = serializedObjectSupporter0.deserializeObjectKryoSerializer1365();
        com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer kryoSerializer6 = serializedObjectSupporter0.deserializeObjectKryoSerializer976();
        org.junit.Assert.assertNotNull(kryoSerializer1);
        org.junit.Assert.assertNotNull(kryoSerializer2);
        org.junit.Assert.assertNotNull(kryoSerializer3);
        org.junit.Assert.assertNotNull(kryoSerializer4);
        org.junit.Assert.assertNotNull(kryoSerializer5);
        org.junit.Assert.assertNotNull(kryoSerializer6);
    }
}

