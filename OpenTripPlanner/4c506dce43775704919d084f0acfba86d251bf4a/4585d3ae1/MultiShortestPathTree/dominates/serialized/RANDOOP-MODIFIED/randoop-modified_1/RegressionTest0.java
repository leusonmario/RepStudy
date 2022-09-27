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
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.StateData stateData1 = new org.opentripplanner.routing.core.StateData(routingRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.opentripplanner.routing.core.State state0 = null;
        org.opentripplanner.routing.core.State state1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state0, state1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter3 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter3.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter3.deserializeObjectVertex26();
        streetEdge2.attachFrom((org.opentripplanner.routing.graph.Vertex) intersectionVertex5);
        double double7 = intersectionVertex5.getLon();
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state10 = new org.opentripplanner.routing.core.State((org.opentripplanner.routing.graph.Vertex) intersectionVertex5, (long) (byte) 10, routingRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-73.9958121d) + "'", double7 == (-73.9958121d));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1860();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1075();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge123();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.slf4j.Logger logger0 = org.opentripplanner.routing.core.State.LOG;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1035();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1050();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState998();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1548();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1392();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1135();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1734();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1175();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState591();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1531();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1718();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1368();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1544();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1869();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState240();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1529();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1009();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1027();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1512();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1202();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter3 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter3.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter3.deserializeObjectVertex26();
        streetEdge2.attachFrom((org.opentripplanner.routing.graph.Vertex) intersectionVertex5);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState443();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter7.deserializeObjectEdge113();
        boolean boolean11 = intersectionVertex5.removeIncoming((org.opentripplanner.routing.graph.Edge) streetEdge10);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter12 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter12.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex14 = serializedObjectSupporter12.deserializeObjectVertex26();
        org.opentripplanner.routing.graph.Vertex.ValidEdgeTypes validEdgeTypes15 = intersectionVertex14.getValidOutgoingEdgeTypes();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter16 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge17 = serializedObjectSupporter16.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter16.deserializeObjectState672();
        org.opentripplanner.routing.core.State state19 = serializedObjectSupporter16.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state20 = serializedObjectSupporter16.deserializeObjectState596();
        org.opentripplanner.routing.core.State state21 = serializedObjectSupporter16.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex22 = serializedObjectSupporter16.deserializeObjectVertex45();
        streetEdge10.attach((org.opentripplanner.routing.graph.Vertex) intersectionVertex14, (org.opentripplanner.routing.graph.Vertex) intersectionVertex22);
        intersectionVertex22.setIndex((int) 'a');
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(streetEdge13);
        org.junit.Assert.assertNotNull(intersectionVertex14);
        org.junit.Assert.assertNotNull(validEdgeTypes15);
        org.junit.Assert.assertNotNull(streetEdge17);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertNull(state20);
        org.junit.Assert.assertNull(state21);
        org.junit.Assert.assertNotNull(intersectionVertex22);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState423();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1192();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state7 = streetEdge5.optimisticTraverse(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1633();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1952();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1844();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState309();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1497();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1962();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState109();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1294();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState24();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState142();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1403();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState905();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState712();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState744();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1078();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState982();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1657();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1186();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState618();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double double0 = org.opentripplanner.routing.spt.MultiShortestPathTree.WEIGHT_EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.02d + "'", double0 == 0.02d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1962();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState109();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex20();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1369();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState64();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter3 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter3.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter3.deserializeObjectVertex26();
        streetEdge2.attachFrom((org.opentripplanner.routing.graph.Vertex) intersectionVertex5);
        int int7 = intersectionVertex5.getDegreeIn();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState959();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1563();
        org.junit.Assert.assertNull(state1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1002();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState644();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1378();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1180();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1801();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1483();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState861();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState464();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1461();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState276();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState176();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1314();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1174();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge6();
        org.opentripplanner.routing.graph.Edge.ValidVertexTypes validVertexTypes9 = streetEdge8.getValidVertexTypes();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(validVertexTypes9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState591();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState910();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex26();
        intersectionVertex6.setIndex((int) (byte) 1);
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState280();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1120();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState354();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1674();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1278();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState555();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState497();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = null;
        multiShortestPathTree1.setstateSets(vertexMap2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex3 = serializedObjectSupporter0.deserializeObjectVertex5();
        int int4 = intersectionVertex3.removeTemporaryEdges();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(intersectionVertex3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1477();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex33();
        java.util.Collection<org.opentripplanner.routing.graph.Edge> edgeCollection8 = intersectionVertex7.getIncoming();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(edgeCollection8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState682();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState62();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState329();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge75();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState950();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1670();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState183();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge138();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1225();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1611();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState682();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1600();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState824();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState664();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1896();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState964();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState834();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1425();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1037();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1117();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState969();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState675();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1839();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1258();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState821();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1716();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1799();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1160();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1703();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1363();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState252();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState652();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1974();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1987();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1664();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1448();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState565();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState898();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState346();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState659();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState55();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1184();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState789();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1964();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState957();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState34();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex38();
        double double9 = intersectionVertex8.getLat();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.723308d + "'", double9 == 40.723308d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState222();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1363();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1057();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1577();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state5 = streetEdge3.optimisticTraverse(state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double0 = org.opentripplanner.routing.spt.MultiShortestPathTree.WALK_DIST_EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.05d + "'", double0 == 0.05d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState745();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState671();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1063();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState995();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState897();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1425();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1037();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.core.StateData stateData11 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(stateData11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState914();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        org.opentripplanner.routing.core.State state3 = multiShortestPathTree1.getState(vertex2);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(stateCollection4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1310();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState306();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState983();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState430();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState880();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1347();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState331();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState295();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge138();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1260();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1399();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1056();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1569();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex23();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState331();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1807();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1291();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1497();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState341();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1346();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1061();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1344();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState897();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState799();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1744();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState190();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1857();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex23();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState95();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState999();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState469();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState146();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1626();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1695();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1135();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState909();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1095();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState479();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1687();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState932();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState240();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1420();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState633();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState598();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState187();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1417();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState811();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState278();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1061();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState51();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1653();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1477();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex33();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1608();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState253();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState409();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState688();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState486();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1057();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState821();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState967();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState87();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState230();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState712();
        ch.qos.logback.classic.Logger logger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState655();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1073();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState78();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState448();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState4();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1933();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState851();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = state9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState652();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState721();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge97();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1149();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState250();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState309();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1845();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1880();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1770();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState986();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState626();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1510();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState668();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1734();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState824();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState661();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1399();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1097();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState544();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState296();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1549();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState784();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge16();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1226();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1463();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState676();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState212();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge108();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1946();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState267();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1468();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState464();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge51();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState240();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState779();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState658();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState212();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge108();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1946();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1223();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState430();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateData10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1043();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex8();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1426();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1321();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState813();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState701();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState147();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1413();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1254();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState921();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1789();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1110();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1667();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = stateData5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1581();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1391();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState20();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1085();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1061();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState364();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1257();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1481();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState414();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState452();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState227();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState206();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state12 = streetEdge10.traverse(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1509();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1505();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1734();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1858();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState828();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1772();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState348();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState682();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge91();
        boolean boolean8 = streetEdge7.vertexTypesValid();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState15();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState379();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1386();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1790();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState575();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1864();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge138();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1260();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState429();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState304();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState844();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1807();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState139();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState577();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1302();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1514();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState769();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState206();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge92();
        org.opentripplanner.routing.core.StateData stateData11 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(stateData11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1112();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1768();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState208();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1568();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1269();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1035();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1260();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState397();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1945();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1852();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState477();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double double0 = org.opentripplanner.routing.spt.MultiShortestPathTree.TIME_EPSILON;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.02d + "'", double0 == 0.02d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState671();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1191();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1499();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1097();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1394();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex3 = serializedObjectSupporter0.deserializeObjectVertex5();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState790();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState138();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(intersectionVertex3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1072();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1574();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState184();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState888();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState146();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1513();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState293();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1340();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1935();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState67();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState627();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState820();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1130();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1567();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1385();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(stateData9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = null;
        multiShortestPathTree1.setstateSets(vertexMap2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = multiShortestPathTree1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState419();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1832();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1180();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1368();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState196();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1043();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState645();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1434();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1437();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState682();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState313();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState616();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1397();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1900();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState980();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState702();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState276();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState595();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1069();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState749();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState538();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState638();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1801();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState861();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1883();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState17();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1186();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1893();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1964();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1780();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1942();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState991();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState671();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1713();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState646();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState800();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1411();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1714();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState883();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1734();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge23();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1011();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1431();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1312();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState434();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1581();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1165();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState372();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState768();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState386();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState756();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState421();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1398();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1320();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState287();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState770();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1931();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState191();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge138();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1260();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1766();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState727();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1829();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState921();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1938();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState591();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState347();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState956();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState657();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1925();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1594();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1610();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1223();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1226();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1463();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge82();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1556();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState73();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1787();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1483();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState702();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1950();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState256();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState23();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1369();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState208();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState862();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState561();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1066();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState448();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState413();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1286();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState250();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge50();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState547();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState712();
        ch.qos.logback.classic.Logger logger7 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge92();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(logger7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1466();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1072();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState101();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1384();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState293();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1340();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState569();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1270();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1969();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1936();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1180();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1801();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1738();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState754();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState633();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState346();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1145();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1361();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1391();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1540();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1356();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState101();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex18();
        java.util.List<org.opentripplanner.routing.graph.Edge> edgeList10 = intersectionVertex9.getOutgoingStreetEdges();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNotNull(edgeList10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState402();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState862();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState832();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState293();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1969();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1527();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1186();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1529();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1096();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState716();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1293();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1832();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge107();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter12 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter12.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge14 = serializedObjectSupporter12.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge15 = serializedObjectSupporter12.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter12.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter12.deserializeObjectState214();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter12.deserializeObjectState769();
        org.opentripplanner.routing.core.State state19 = serializedObjectSupporter12.deserializeObjectState1942();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge20 = serializedObjectSupporter12.deserializeObjectEdge67();
        boolean boolean21 = streetEdge11.isEquivalentTo((org.opentripplanner.routing.graph.Edge) streetEdge20);
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(streetEdge14);
        org.junit.Assert.assertNotNull(streetEdge15);
        org.junit.Assert.assertNull(state16);
        org.junit.Assert.assertNull(state17);
        org.junit.Assert.assertNull(state18);
        org.junit.Assert.assertNull(state19);
        org.junit.Assert.assertNotNull(streetEdge20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState424();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1832();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState805();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState608();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState276();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState595();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1799();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1487();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex41();
        int int5 = intersectionVertex4.getDegreeIn();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1527();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1974();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState788();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState109();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState325();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1119();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge9();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1393();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState448();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState814();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1344();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState638();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState370();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1587();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState6();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1056();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState325();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState715();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1346();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1813();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1696();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState490();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1610();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState755();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState206();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState702();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1950();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState370();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState956();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState765();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState828();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState609();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState402();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState862();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState457();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1056();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState852();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState134();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState386();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1656();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState622();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState632();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1632();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState202();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState669();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState206();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1997();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge14 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState1956();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNotNull(streetEdge14);
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1226();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1425();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState940();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState155();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState684();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState434();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState24();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1060();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState594();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1979();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1496();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState23();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState453();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1226();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1463();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState859();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState514();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1355();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1491();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection2 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(stateCollection2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1430();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1308();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex30();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState429();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1359();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1278();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1237();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1799();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1762();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1993();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState669();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge88();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState535();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1635();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState568();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState388();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState937();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState346();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState832();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1344();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState475();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1833();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1720();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1321();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState371();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1114();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState967();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1895();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1843();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState722();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1237();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState897();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState802();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1669();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1252();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState591();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1531();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1221();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1855();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1066();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1234();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1886();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge19();
        java.lang.String str6 = streetEdge5.toString();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter7.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState368();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState336();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex12 = serializedObjectSupporter7.deserializeObjectVertex25();
        java.lang.String str13 = intersectionVertex12.toString();
        streetEdge5.attachTo((org.opentripplanner.routing.graph.Vertex) intersectionVertex12);
        double double15 = intersectionVertex12.getLat();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PlainStreetEdge(108, West Broadway, <osm:node:1919595916 lat,lng=40.7268923,-73.9999617> -> <osm:node:42454423 lat,lng=40.725773,-74.000898> length=147.362 carSpeed=11.2 permission=ALL)" + "'", str6, "PlainStreetEdge(108, West Broadway, <osm:node:1919595916 lat,lng=40.7268923,-73.9999617> -> <osm:node:42454423 lat,lng=40.725773,-74.000898> length=147.362 carSpeed=11.2 permission=ALL)");
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(intersectionVertex12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<osm:node:42442273 lat,lng=40.723795,-74.000367>" + "'", str13, "<osm:node:42442273 lat,lng=40.723795,-74.000367>");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.723795d + "'", double15 == 40.723795d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1845();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1295();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex3 = serializedObjectSupporter0.deserializeObjectVertex5();
        boolean boolean4 = intersectionVertex3.edgeTypesValid();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter5.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter5.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter5.deserializeObjectState564();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter5.deserializeObjectState794();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter5.deserializeObjectState662();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter5.deserializeObjectVertex26();
        double double12 = intersectionVertex3.azimuthTo((org.opentripplanner.routing.graph.Vertex) intersectionVertex11);
        boolean boolean13 = intersectionVertex3.edgeTypesValid();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(intersectionVertex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(intersectionVertex11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 115.58392222008641d + "'", double12 == 115.58392222008641d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1561();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge42();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge18();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1420();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge8();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState881();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1411();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState342();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState502();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState329();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1015();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1000();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState545();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState995();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1830();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState598();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState339();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1820();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState831();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge29();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge138();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1594();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState520();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState383();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState864();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState496();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState561();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1151();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1180();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1801();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState390();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState466();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState193();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1499();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge16();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1572();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateData10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState414();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge16();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(streetEdge12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex8();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter10.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter10.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter10.deserializeObjectState310();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter10.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge15 = serializedObjectSupporter10.deserializeObjectEdge104();
        boolean boolean16 = intersectionVertex9.removeOutgoing((org.opentripplanner.routing.graph.Edge) streetEdge15);
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNotNull(streetEdge12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNotNull(streetEdge15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState731();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1028();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1706();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState42();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1561();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex2();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1899();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1984();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge92();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1992();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState555();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState124();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState366();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState388();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState139();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState443();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState971();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1425();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState22();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState841();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1278();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState707();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState528();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1043();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex8();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1729();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState27();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState303();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState103();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1376();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1248();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState206();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState993();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState727();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState665();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState206();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1997();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1618();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex35();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge50();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState696();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1241();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState591();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState347();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState156();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState859();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState739();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState695();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1176();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1814();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState712();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1009();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1402();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState731();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState855();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState424();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge82();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState683();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1928();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1662();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge47();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1534();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState144();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState893();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1186();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1529();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1827();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState304();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1110();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState163();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState986();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState669();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState784();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1306();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1278();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1788();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState617();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1799();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge88();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState820();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1761();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1076();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState386();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState601();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1465();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1887();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState880();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState492();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1393();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(stateData4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState462();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1472();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState143();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1348();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1130();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(stateData8);
        org.junit.Assert.assertNull(stateData9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex3 = serializedObjectSupporter0.deserializeObjectVertex5();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1489();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(intersectionVertex3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState858();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex2();
        double double6 = intersectionVertex5.getLon();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-73.9998648d) + "'", double6 == (-73.9998648d));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState828();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1331();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1561();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState448();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1558();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1163();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState216();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1732();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState650();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1169();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1320();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState796();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1070();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex3 = serializedObjectSupporter0.deserializeObjectVertex5();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState790();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1289();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState606();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(intersectionVertex3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1610();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState455();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState479();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1189();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1845();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1264();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1424();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState475();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState897();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex29();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState48();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge116();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1698();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1820();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState227();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1685();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState161();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState429();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState358();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1228();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState985();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1993();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState140();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1706();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1509();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState973();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1425();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1037();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1372();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1174();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState158();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex30();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState212();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge108();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1946();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1078();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(stateData10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1340();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState545();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1043();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex8();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1426();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState612();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState296();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge128();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(streetEdge11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge44();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState361();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState477();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState263();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1197();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState997();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState337();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState713();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState10();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1744();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState879();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1117();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState429();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState358();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1228();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1943();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState251();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1590();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1488();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1608();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState412();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState991();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1733();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1209();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState610();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState382();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1103();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1198();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState867();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1870();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1849();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(stateData5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState376();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState624();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState429();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState358();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1228();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1058();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1226();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1150();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState538();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState117();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState50();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState688();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1487();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState56();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex45();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState375();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState139();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState577();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState922();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1309();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1496();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1890();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState214();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1358();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge99();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState269();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex30();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1021();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1792();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState407();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1510();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState175();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState280();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge12();
        java.lang.String str4 = streetEdge3.getDirection();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1136();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState424();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState519();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState885();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1356();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState682();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1547();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1658();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1030();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState669();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1337();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState265();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState429();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState358();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1749();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState268();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1027();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState634();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState309();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState57();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState854();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState113();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState597();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState478();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState249();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1416();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState694();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState822();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState193();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1533();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState363();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState573();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState733();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(streetEdge11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState276();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState595();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1666();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState182();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1828();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1533();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1027();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState212();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge108();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1946();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1202();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1423();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1427();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1228();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState528();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1132();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState651();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState242();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1056();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState956();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1423();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1736();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState346();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1643();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1699();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1749();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState433();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState587();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1792();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1825();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1264();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1745();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState108();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState363();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1608();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState521();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState628();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState484();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState368();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState746();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1545();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex42();
        int int8 = intersectionVertex7.removeTemporaryEdges();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState699();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1847();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState58();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState206();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState80();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState620();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1117();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState964();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState107();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState868();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge89();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1386();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState208();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState862();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState817();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1180();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1368();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1189();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1479();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState564();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState794();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState662();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState593();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1586();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1232();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1975();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1889();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1360();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(stateData7);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1845();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState803();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState388();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState672();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1958();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState596();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState541();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1456();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState708();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState206();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1997();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState398();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter0.deserializeObjectState1860();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertNull(state12);
        org.junit.Assert.assertNull(state13);
        org.junit.Assert.assertNull(state14);
        org.junit.Assert.assertNull(state15);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1904();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState962();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState657();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1441();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1249();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1126();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1195();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState671();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState7();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState76();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex27();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(stateData2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState391();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1889();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1360();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState443();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState378();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1880();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1356();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState101();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState837();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1173();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState310();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1815();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState212();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge108();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1406();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState380();
        org.junit.Assert.assertNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(stateData6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex26();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState479();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState25();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1333();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState425();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNull(state5);
        org.junit.Assert.assertNull(state6);
        org.junit.Assert.assertNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge1 = serializedObjectSupporter0.deserializeObjectEdge5();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState582();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState560();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1049();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState950();
        org.junit.Assert.assertNotNull(streetEdge1);
        org.junit.Assert.assertNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNull(state6);
    }
}

