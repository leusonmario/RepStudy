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
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state2 = new org.opentripplanner.routing.core.State(vertex0, routingRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) '4', routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.opentripplanner.routing.graph.Vertex vertex0 = null;
        org.opentripplanner.routing.graph.Edge edge1 = null;
        org.opentripplanner.routing.core.RoutingRequest routingRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state4 = new org.opentripplanner.routing.core.State(vertex0, edge1, (long) (short) 10, routingRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = null;
        multiShortestPathTree1.stateSets = vertexMap2;
        org.opentripplanner.routing.graph.Vertex vertex4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.spt.GraphPath graphPath6 = multiShortestPathTree1.getPath(vertex4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1890();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState607();
        state4.walkDistance = (short) 10;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.TraverseMode traverseMode6 = state5.getNonTransitMode();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + traverseMode6 + "' != '" + org.opentripplanner.routing.core.TraverseMode.WALK + "'", traverseMode6.equals(org.opentripplanner.routing.core.TraverseMode.WALK));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState784();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1102();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        int int3 = state2.getTimeDeltaSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState251();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1515();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState98();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1816();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState934();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState995();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState897();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState32();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState668();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState675();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge35();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState8();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState683();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState926();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState933();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1074();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState926();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState956();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState782();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1334();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1130();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1171();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState313();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState975();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState952();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1990();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1753();
        boolean boolean7 = state6.isFinal();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState700();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState600();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState907();
        org.opentripplanner.routing.core.State state10 = state6.addToExistingResultChain(state9);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1470();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1806();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState580();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState156();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState366();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState841();
        boolean boolean9 = state3.betterThan(state8);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1582();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.slf4j.Logger logger0 = org.opentripplanner.routing.spt.MultiShortestPathTree.LOG;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState14();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1495();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1712();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState608();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState128();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState409();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1074();
        org.opentripplanner.routing.graph.Edge edge7 = state6.backEdge;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(edge7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState415();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState833();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1047();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState516();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1045();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState516();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState859();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState520();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1824();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1724();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState520();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState538();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState388();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState668();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        boolean boolean6 = state4.exceedsWeightLimit((double) 0L);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState160();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState470();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge141();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState865();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1652();
        boolean boolean9 = state8.isBikeParked();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1955();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState44();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1520();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1604();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1670();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState905();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1277();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1530();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState269();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1151();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1723();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState649();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState902();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState990();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1146();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1907();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1801();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1678();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1296();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1119();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState495();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState961();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1715();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState26();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1586();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState143();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState465();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState70();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        state3.checkNegativeWeight();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1643();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1014();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState492();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1955();
        org.opentripplanner.routing.core.State state9 = state8.getNextResult();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState214();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState788();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1712();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState722();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1148();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1338();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState209();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState260();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState514();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1829();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1213();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex24();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1934();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState607();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1713();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState854();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState628();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1926();
        org.onebusaway.gtfs.model.Stop stop5 = state4.getPreviousStop();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNull(stop5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState171();
        java.lang.String str7 = state6.toStringVerbose();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<State Tue Dec 07 11:29:25 BRT 2021 w=731.4209999999999 t=735 d=691.821 p=0 b=0 br=false pr=false>" + "'", str7, "<State Tue Dec 07 11:29:25 BRT 2021 w=731.4209999999999 t=735 d=691.821 p=0 b=0 br=false pr=false>");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState643();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1559();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1802();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1830();
        double double6 = state5.getWalkAtLastTransit();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState882();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState728();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState642();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState767();
        boolean boolean12 = state6.routeSequenceSuperset(state11);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState8();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1096();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1085();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1695();
        state5.dumpPath();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState68();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1935();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex30();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState864();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState179();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState762();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState514();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1249();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState942();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState134();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState481();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState676();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState183();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1203();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge111();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState679();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState601();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState398();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState663();
        long long9 = state8.getActiveTime();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 532L + "'", long9 == 532L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1468();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1628();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1029();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState446();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.graph.Edge edge6 = state5.getBackEdge();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(edge6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1665();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState716();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState851();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState282();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1608();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState150();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1988();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState279();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState35();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState252();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1751();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState111();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1296();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1119();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1618();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        java.lang.Class<?> wildcardClass5 = state4.getClass();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1907();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex30();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState992();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1764();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState954();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1373();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1018();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState171();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState704();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge61();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1645();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState745();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState637();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState512();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState263();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1760();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState905();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1277();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState743();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState601();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState934();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState371();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1539();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState151();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState514();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1249();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState495();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState446();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState836();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1247();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState345();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1657();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState176();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1280();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1602();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge42();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState134();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState62();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1568();
        boolean boolean6 = state5.isBikeRenting();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState315();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState450();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1383();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState949();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1955();
        org.opentripplanner.routing.core.State state9 = state8.optimize();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1575();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState305();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1549();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState289();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState590();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex29();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter5.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter5.deserializeObjectState990();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter5.deserializeObjectState1005();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter5.deserializeObjectVertex48();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState606();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter11.deserializeObjectState550();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter11.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter11.deserializeObjectState1436();
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = state15.getOptions();
        org.opentripplanner.routing.core.State state17 = new org.opentripplanner.routing.core.State((org.opentripplanner.routing.graph.Vertex) intersectionVertex9, (long) '4', routingRequest16);
        org.opentripplanner.routing.core.State state18 = new org.opentripplanner.routing.core.State((org.opentripplanner.routing.graph.Vertex) intersectionVertex4, routingRequest16);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(routingRequest16);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1158();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1727();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState450();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1166();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1265();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState758();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState913();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState101();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1136();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState68();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState517();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState347();
        double double8 = state7.weight;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1080.919d + "'", double8 == 1080.919d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1582();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState918();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState553();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest4 = multiShortestPathTree1.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList5 = multiShortestPathTree1.getPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(stateList3);
        org.junit.Assert.assertNull(routingRequest4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1315();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState857();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1988();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1109();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState116();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState590();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState35();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1288();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1717();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge72();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1576();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1186();
        long long6 = state5.getElapsedTimeSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 253L + "'", long6 == 253L);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState133();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1524();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState979();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState325();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState534();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState1625();
        boolean boolean11 = state6.routeSequencePrefix(state10);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge97();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1007();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.slf4j.Logger logger7 = state6.getLOG();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(logger7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState571();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState866();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState8();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1096();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1539();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1178();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1295();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1020();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState502();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1052();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1835();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1089();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState79();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState861();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState242();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1047();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1625();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState95();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState433();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState744();
        boolean boolean8 = state7.isOnboard();
        org.opentripplanner.routing.core.TraverseMode traverseMode9 = state7.getBackMode();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + traverseMode9 + "' != '" + org.opentripplanner.routing.core.TraverseMode.WALK + "'", traverseMode9.equals(org.opentripplanner.routing.core.TraverseMode.WALK));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1625();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1402();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState306();
        org.opentripplanner.routing.core.State state6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = state5.routeSequenceSubset(state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1484();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState389();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState814();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState861();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState178();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState514();
        state5.time = 0L;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState361();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1520();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1604();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1724();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState875();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState353();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1084();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState398();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1555();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState450();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1491();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState357();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState560();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState372();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState269();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState681();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1296();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1119();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1484();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1315();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState525();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1830();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState704();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState42();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState990();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState503();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter7.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter7.deserializeObjectEdge74();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter15 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter15.deserializeObjectState606();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter15.deserializeObjectState550();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter15.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state19 = serializedObjectSupporter15.deserializeObjectState1436();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = state19.getOptions();
        org.opentripplanner.routing.core.State state21 = new org.opentripplanner.routing.core.State((org.opentripplanner.routing.graph.Vertex) intersectionVertex6, (org.opentripplanner.routing.graph.Edge) streetEdge13, 100L, routingRequest20);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(streetEdge13);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertNotNull(state19);
        org.junit.Assert.assertNotNull(routingRequest20);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.slf4j.Logger logger2 = multiShortestPathTree1.getLOG();
        org.slf4j.Logger logger3 = multiShortestPathTree1.getLOG();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState600();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState132();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState1578();
        org.opentripplanner.routing.graph.Vertex vertex8 = state7.vertex;
        org.opentripplanner.routing.spt.GraphPath graphPath10 = multiShortestPathTree1.getPath(vertex8, false);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(vertex8);
        org.junit.Assert.assertNull(graphPath10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState259();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1892();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1657();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState189();
        state6.weight = 10L;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState293();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState571();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1567();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState282();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1530();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState486();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1483();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState313();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1195();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState230();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState926();
        long long5 = state4.getElapsedTimeSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 897L + "'", long5 == 897L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState219();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge90();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState725();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState192();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1008();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1292();
        org.onebusaway.gtfs.model.Trip trip9 = state8.getBackTrip();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNull(trip9);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1497();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1005();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState900();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1591();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1074();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1175();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState650();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1611();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState701();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState390();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState600();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState132();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState377();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState666();
        state6.backState = state11;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState931();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState305();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState236();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1257();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1619();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge107();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState926();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1878();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1895();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1638();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1122();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState412();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState918();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1000();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState374();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1500();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState179();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1734();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1200();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1287();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState248();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState73();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1295();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1569();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState656();
        org.opentripplanner.routing.core.State state5 = state4.reversedClone();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState279();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState711();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1131();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1731();
        org.opentripplanner.routing.core.State state6 = state5.reverse();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1367();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState462();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1610();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState743();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState546();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState673();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState400();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState478();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState196();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1948();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1625();
        long long4 = state3.getTimeSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1638886886L + "'", long4 == 1638886886L);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1169();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1182();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1628();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState875();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1475();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1731();
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId6 = state5.getTripId();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNull(agencyAndId6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState181();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState323();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState124();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState387();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1099();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge82();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState441();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1717();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1351();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState446();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState163();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1364();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState805();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState511();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState668();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState847();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState449();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState104();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1189();
        org.slf4j.Logger logger10 = state9.getLOG();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(logger10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1436();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1339();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1806();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState920();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1713();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.slf4j.Logger logger2 = multiShortestPathTree1.getLOG();
        org.slf4j.Logger logger3 = multiShortestPathTree1.getLOG();
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection4 = multiShortestPathTree1.getAllStates();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = multiShortestPathTree1.getOptions();
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(logger3);
        org.junit.Assert.assertNotNull(stateCollection4);
        org.junit.Assert.assertNull(routingRequest5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.graph.Vertex vertex6 = state5.vertex;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(vertex6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState474();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.StateData stateData5 = state4.stateData;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState643();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState66();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState446();
        double double3 = state2.getWalkAtLastTransit();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1693();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState450();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1491();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1688();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState647();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState605();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState370();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1066();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge73();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState199();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState188();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1167();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1156();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState137();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState125();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1447();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState307();
        boolean boolean8 = state7.allPathParsersAccept();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState847();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1311();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1976();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1290();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge126();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState248();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState403();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState180();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        state2.time = (short) -1;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1824();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState692();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState111();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState864();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState44();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1412();
        org.opentripplanner.routing.core.RoutingContext routingContext9 = state8.getContext();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(routingContext9);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState483();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState531();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState828();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1050();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1315();
        double double6 = state5.getWeightDelta();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 170.49299999999994d + "'", double6 == 170.49299999999994d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1517();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1467();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState348();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState139();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1678();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState398();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1822();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.graph.Vertex vertex2 = null;
        java.util.List<org.opentripplanner.routing.core.State> stateList3 = multiShortestPathTree1.getStates(vertex2);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState600();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState898();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter4.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter4.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter4.deserializeObjectState1947();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = multiShortestPathTree1.visit(state11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(stateList3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1085();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState325();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1263();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1028();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1107();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1907();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1023();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState961();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState293();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState830();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState1832();
        boolean boolean8 = state3.betterThan(state7);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState951();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1252();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState125();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState450();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1383();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1255();
        org.opentripplanner.routing.core.State state11 = state10.getNextResult();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState933();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1389();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1719();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge36();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1153();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState311();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState425();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1158();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1536();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState853();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1139();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState610();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1338();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge22();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1256();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1603();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1296();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState201();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1336();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1978();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState668();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState847();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState620();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState700();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1468();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1915();
        long long5 = state4.getStartTimeSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1638886630L + "'", long5 == 1638886630L);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1947();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1812();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState581();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState833();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1550();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState240();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1357();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState878();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1268();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1886();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1285();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState718();
        boolean boolean4 = state3.isCarParked();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1448();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1859();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1317();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState18();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1809();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1824();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState692();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState111();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1949();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1079();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1130();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState297();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1154();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState777();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState31();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge25();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState130();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1404();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1990();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1753();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState430();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState614();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1241();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1907();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1198();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState559();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1314();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState331();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge101();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState699();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1314();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1533();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge22();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState219();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge90();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState769();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState433();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState744();
        double double8 = state7.getWalkDistance();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 621.929d + "'", double8 == 621.929d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1738();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge141();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1074();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1797();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState167();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState133();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState191();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1592();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge143();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1590();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1606();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge122();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState556();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1645();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState745();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState637();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge113();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState462();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState614();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1575();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState357();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge115();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState537();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1396();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1533();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1845();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1877();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState199();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState737();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState390();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState687();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge50();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1710();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState729();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState377();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1990();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1753();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1071();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1759();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1995();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1099();
        org.opentripplanner.routing.core.State state5 = state4.clone();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState614();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1575();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge64();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState959();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState706();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState462();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1610();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState791();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1441();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1007();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1038();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState729();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1762();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState817();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1904();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex16();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState625();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState127();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState259();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState591();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1955();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1531();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1991();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState567();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState812();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState159();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1874();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState67();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1018();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1018();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState643();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1926();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1872();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge124();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState183();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1203();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState80();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState357();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState959();
        org.opentripplanner.routing.core.State state8 = state7.next;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNull(state8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1169();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState658();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState965();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge101();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1331();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState976();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1907();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState518();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState438();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1268();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1262();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState679();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState331();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1465();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1520();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1604();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState374();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState776();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1483();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1357();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1403();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1789();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1614();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1616();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState614();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1082();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge4();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState878();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState562();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1173();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState934();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1819();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1200();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1541();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState415();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1394();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1659();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState762();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState248();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState858();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.slf4j.Logger logger2 = multiShortestPathTree1.getLOG();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter3 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter3.deserializeObjectState600();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter3.deserializeObjectState898();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter3.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter3.deserializeObjectState189();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter3.deserializeObjectState686();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter3.deserializeObjectState990();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter3.deserializeObjectState1806();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter3.deserializeObjectState920();
        multiShortestPathTree1.postVisit(state11);
        org.opentripplanner.routing.core.RoutingRequest routingRequest13 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest13);
        java.util.Set<org.opentripplanner.routing.graph.Vertex> vertexSet15 = multiShortestPathTree14.getVertices();
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap16 = multiShortestPathTree14.stateSets;
        multiShortestPathTree1.setstateSets(vertexMap16);
        org.junit.Assert.assertNotNull(logger2);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(vertexSet15);
        org.junit.Assert.assertNotNull(vertexMap16);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1940();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge56();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1037();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1881();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState76();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState520();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState538();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1039();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter12 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter12.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter12.deserializeObjectState728();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter12.deserializeObjectState503();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter12.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter12.deserializeObjectState553();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter12.deserializeObjectState872();
        org.opentripplanner.routing.core.State state19 = serializedObjectSupporter12.deserializeObjectState992();
        boolean boolean20 = state11.betterThan(state19);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertNotNull(state19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1625();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState949();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState412();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState446();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1850();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState259();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1892();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState240();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState336();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1152();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1071();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1579();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge13();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState760();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState826();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState436();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1246();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState589();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState584();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1307();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState432();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState400();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState478();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState478();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState176();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1021();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge145();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1852();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1191();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1154();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1560();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState668();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState847();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState861();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1217();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState339();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState218();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1876();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState546();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1710();
        org.opentripplanner.routing.graph.Edge edge7 = state6.backEdge;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(edge7);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState233();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState656();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge115();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1149();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1582();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1295();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState397();
        org.onebusaway.gtfs.model.Trip trip4 = state3.getPreviousTrip();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNull(trip4);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState610();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1431();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1185();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1552();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState146();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1355();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1415();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState348();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState646();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState607();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1732();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1047();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1302();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState138();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState446();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState163();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState464();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState961();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1715();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1019();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState606();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter6.deserializeObjectState550();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter6.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter6.deserializeObjectState1436();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = state10.getOptions();
        org.opentripplanner.routing.core.State state12 = new org.opentripplanner.routing.core.State((org.opentripplanner.routing.graph.Vertex) intersectionVertex4, (long) '4', routingRequest11);
        org.opentripplanner.routing.core.State state13 = new org.opentripplanner.routing.core.State(routingRequest11);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(routingRequest11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState497();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge49();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge101();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1567();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState75();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1131();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState781();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1902();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState133();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1040();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState220();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState261();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState534();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1625();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState678();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1912();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState551();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1945();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1606();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState96();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1832();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1544();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1322();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState629();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1406();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState552();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1653();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1712();
        org.opentripplanner.routing.graph.Edge edge6 = state5.backEdge;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(edge6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState890();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1992();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState919();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex41();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState832();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1231();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1510();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState133();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1040();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1194();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex24();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState462();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge17();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1692();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState546();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState216();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState686();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1541();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState795();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1835();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1046();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1835();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1844();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1048();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1027();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState229();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1775();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1904();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState668();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState847();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState449();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState104();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1189();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState747();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState134();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState481();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1115();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState878();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState356();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex48();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState398();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1016();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex1 = serializedObjectSupporter0.deserializeObjectVertex23();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1481();
        org.junit.Assert.assertNotNull(intersectionVertex1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState649();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1432();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState221();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1122();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState41();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState912();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1312();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1196();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1397();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge43();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1612();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState845();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState722();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1533();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge19();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1186();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState768();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1390();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1403();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1673();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState35();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1288();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState992();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState400();
        long long6 = state5.getLastAlightedTimeSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1709();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState941();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex17();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1747();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState643();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState546();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState725();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1618();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1197();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState313();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState467();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState279();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1955();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1531();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1991();
        java.lang.String str11 = state10.toString();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<State Tue Dec 07 11:33:15 BRT 2021 [958.4949999999998] <osm:node:42445498 lat,lng=40.723686,-73.996476>>" + "'", str11, "<State Tue Dec 07 11:33:15 BRT 2021 [958.4949999999998] <osm:node:42445498 lat,lng=40.723686,-73.996476>>");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1455();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1150();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1252();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1023();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1579();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState437();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState162();
        java.lang.String str9 = state8.toString();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<State Tue Dec 07 11:25:44 BRT 2021 [512.784] <osm:node:42430108 lat,lng=40.724267,-74.004739>>" + "'", str9, "<State Tue Dec 07 11:25:44 BRT 2021 [512.784] <osm:node:42430108 lat,lng=40.724267,-74.004739>>");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1468();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1915();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1260();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1705();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1236();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1074();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1709();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1630();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState727();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge33();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1834();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge24();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1875();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1174();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1741();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState415();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1606();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState806();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1889();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState129();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1549();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState9();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1976();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState324();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState520();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState433();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState552();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState450();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge73();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1549();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState745();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge60();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState374();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState734();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState636();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1976();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState324();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState653();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter8.deserializeObjectState728();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState668();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState1901();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter8.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter8.deserializeObjectState847();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter8.deserializeObjectState449();
        boolean boolean16 = state7.routeSequenceSubset(state15);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1209();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState639();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState114();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState733();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1159();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex47();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState934();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState371();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1539();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1859();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState279();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState199();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1259();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1713();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState604();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1550();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState465();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState546();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState338();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1142();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState82();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge74();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1514();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState381();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState363();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1885();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1084();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1547();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState473();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState183();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1169();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1182();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1692();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState520();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState237();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState219();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1665();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1638();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState184();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState845();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1525();
        long long3 = state2.getActiveTime();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 724L + "'", long3 == 724L);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1686();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge36();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState961();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1629();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1023();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState985();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1943();
        org.opentripplanner.routing.core.ServiceDay serviceDay7 = state6.getServiceDay();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNull(serviceDay7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState514();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1829();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge66();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1728();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge65();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1577();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState50();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1122();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1520();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState247();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState984();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState700();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState99();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1744();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState299();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState115();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState133();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1524();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState816();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge85();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1089();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex25();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1821();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState559();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState20();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState814();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1148();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge68();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1549();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState441();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1983();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1187();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1158();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1536();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState191();
        org.slf4j.Logger logger8 = state7.getLOG();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(logger8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1474();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1113();
        org.opentripplanner.routing.graph.Vertex vertex6 = state5.vertex;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(vertex6);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState594();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState631();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1988();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1642();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState727();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1424();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1462();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1679();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState723();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter0.deserializeObjectState1746();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState875();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState353();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState612();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState182();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1024();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState977();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1738();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1128();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1663();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState400();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState478();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState126();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState902();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1650();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState752();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge134();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState162();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1492();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1435();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState297();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge84();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState150();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState714();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState872();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState356();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1639();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1314();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1533();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState984();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState990();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState594();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState631();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1988();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState519();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1799();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState456();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState676();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1007();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1785();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1167();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1614();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge76();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState483();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1961();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1511();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState721();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1934();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState657();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState613();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState248();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState132();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState580();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState35();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1288();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1717();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState728();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState606();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1314();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1533();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState105();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1992();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState503();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1620();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1520();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1965();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1842();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState728();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState668();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1560();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState56();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState898();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1914();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1335();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1183();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState462();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState492();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState600();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState132();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1606();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1063();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1081();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }
}

