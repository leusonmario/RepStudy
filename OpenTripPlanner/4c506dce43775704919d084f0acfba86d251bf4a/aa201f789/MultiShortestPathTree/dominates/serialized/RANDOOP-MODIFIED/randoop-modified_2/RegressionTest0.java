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
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.slf4j.Logger logger2 = multiShortestPathTree1.getLOG();
        org.junit.Assert.assertNotNull(logger2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState508();
        java.lang.String str6 = state5.getZone();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Collection<org.opentripplanner.routing.core.State> stateCollection2 = multiShortestPathTree1.getAllStates();
        org.junit.Assert.assertNotNull(stateCollection2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState1469();
        boolean boolean8 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state3, state7);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        int[] intArray3 = state2.pathParserStates;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter4.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter4.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state9 = state3.addToExistingResultChain(state8);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState568();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1478();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter7.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState685();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter7.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter7.deserializeObjectState748();
        boolean boolean14 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state6, state13);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        java.lang.String str4 = streetEdge3.getName();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "West Broadway" + "'", str4, "West Broadway");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        double double7 = state6.weight;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 435.45d + "'", double7 == 435.45d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState609();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState486();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState463();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1808();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState757();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter8.deserializeObjectState730();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState412();
        boolean boolean12 = state7.routeSequencePrefix(state11);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter4.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter4.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter4.deserializeObjectState261();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter4.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter4.deserializeObjectState568();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter4.deserializeObjectState1478();
        boolean boolean13 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state3, state12);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1345();
        boolean boolean6 = state5.isBackWalkingBike();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState411();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState601();
        state7.walkDistance = '#';
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        java.util.Set<java.lang.String> strSet6 = state5.getBikeRentalNetworks();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState501();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1241();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter6.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray8 = stateData7.getrouteSequence();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray9 = null;
        stateData7.routeSequence = agencyAndIdArray9;
        state5.stateData = stateData7;
        double double12 = state5.getWalkSinceLastTransit();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(agencyAndIdArray8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 302.682d + "'", double12 == 302.682d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1948();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState626();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state3, state4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1707();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState590();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1494();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1766();
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1826();
        java.lang.String str5 = state4.getZone();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        boolean boolean6 = streetEdge5.hasBogusName();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState508();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState139();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = state4.detachNextResult();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNull(state5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        java.lang.String str3 = stateData1.zone;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        intersectionVertex2.removeAllEdges();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter4.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState21();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter4.deserializeObjectEdge18();
        boolean boolean9 = intersectionVertex2.removeIncoming((org.opentripplanner.routing.graph.Edge) streetEdge8);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter3 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter3.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter3.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter3.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter3.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter3.deserializeObjectEdge106();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter9 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter9.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter9.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter9.deserializeObjectEdge57();
        org.opentripplanner.routing.graph.Edge[] edgeArray13 = new org.opentripplanner.routing.graph.Edge[] { streetEdge2, streetEdge8, streetEdge12 };
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter14 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter14.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge16 = serializedObjectSupporter14.deserializeObjectEdge137();
        org.opentripplanner.routing.graph.Edge[] edgeArray17 = org.opentripplanner.routing.graph.Vertex.removeEdge(edgeArray13, (org.opentripplanner.routing.graph.Edge) streetEdge16);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(streetEdge12);
        org.junit.Assert.assertNotNull(edgeArray13);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(streetEdge16);
        org.junit.Assert.assertNotNull(edgeArray17);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1381();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        boolean boolean7 = state6.isOnboard();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex14();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1524();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState205();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState437();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter4.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter4.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter4.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter4.deserializeObjectState1595();
        boolean boolean11 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state3, state10);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState848();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState922();
        boolean boolean4 = state3.isEverBoarded();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1924();
        state7.time = (byte) 100;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState365();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState935();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState72();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState960();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1005();
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state7 = state4.optimizeOrReverse(true, false);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState674();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState823();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter4.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter4.deserializeObjectEdge54();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter4.deserializeObjectVertex31();
        streetEdge3.attachTo((org.opentripplanner.routing.graph.Vertex) intersectionVertex11);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(intersectionVertex11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState6();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState508();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState338();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState394();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState97();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState469();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState972();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter7.deserializeObjectState1608();
        boolean boolean13 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state6, state12);
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
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState715();
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId7 = state6.getRoute();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNull(agencyAndId7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex19();
        int int6 = intersectionVertex5.removeTemporaryEdges();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState753();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1192();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState800();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        int int6 = streetEdge5.detach();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1330();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState112();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1656();
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1581();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1339();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1450();
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1361();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState556();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1924();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1358();
        int int9 = state8.getTimeDeltaSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 113 + "'", int9 == 113);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1614();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState535();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState104();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter4.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState425();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter4.deserializeObjectState61();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter4.deserializeObjectState589();
        boolean boolean11 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state3, state10);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState674();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1737();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1131();
        long long6 = state5.getTimeInMillis();
        state5.time = ' ';
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1638887170000L + "'", long6 == 1638887170000L);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1829();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge18();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1868();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState34();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState508();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState338();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge25();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState1996();
        org.opentripplanner.routing.core.State state10 = streetEdge7.optimisticTraverse(state9);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList6 = multiShortestPathTree5.getPaths();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNotNull(graphPathList6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState459();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState106();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1195();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1711();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.onebusaway.gtfs.model.Trip trip4 = streetEdge3.getTrip();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNull(trip4);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1180();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState511();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1077();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState250();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.trippattern.TripTimes tripTimes5 = stateData4.tripTimes;
        org.opentripplanner.routing.trippattern.TripTimes tripTimes6 = stateData4.gettripTimes();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNull(tripTimes5);
        org.junit.Assert.assertNull(tripTimes6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState195();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge57();
        boolean boolean4 = streetEdge3.hasBogusName();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1917();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1740();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState400();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1366();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1610();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState46();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1697();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState882();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1339();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState914();
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1921();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState609();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.StateData stateData4 = state3.getstateData();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState534();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1140();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState964();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState398();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1924();
        state7.checkNegativeWeight();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge18();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState56();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1924();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState353();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1211();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.core.StateData stateData3 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData4 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter5.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray7 = stateData6.getrouteSequence();
        stateData4.routeSequence = agencyAndIdArray7;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap9 = stateData4.extensions;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(agencyAndIdArray7);
        org.junit.Assert.assertNull(objMap9);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1253();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState699();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1660();
        org.opentripplanner.routing.core.State state5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state4, state5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.graph.Vertex vertex5 = state4.getVertex();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter6.deserializeObjectVertex11();
        intersectionVertex8.removeAllEdges();
        boolean boolean10 = intersectionVertex8.edgeTypesValid();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState757();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter11.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter11.deserializeObjectState1215();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge15 = serializedObjectSupporter11.deserializeObjectEdge10();
        intersectionVertex8.addOutgoing((org.opentripplanner.routing.graph.Edge) streetEdge15);
        boolean boolean17 = vertex5.removeIncoming((org.opentripplanner.routing.graph.Edge) streetEdge15);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(vertex5);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(streetEdge15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter8.deserializeObjectState998();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState1318();
        boolean boolean13 = state7.routeSequenceSubset(state12);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1123();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter10.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter10.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter10.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter10.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter10.deserializeObjectState989();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter10.deserializeObjectState1065();
        boolean boolean17 = state9.routeSequencePrefix(state16);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(streetEdge12);
        org.junit.Assert.assertNotNull(streetEdge13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState686();
        java.lang.Class<?> wildcardClass3 = state2.getClass();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState485();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.State state1 = new org.opentripplanner.routing.core.State(routingRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1438();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState926();
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1377();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState644();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1810();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1110();
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1762();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1082();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge119();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1853();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState43();
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1722();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState723();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData4 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData5 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState454();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1509();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge51();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge58();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1020();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(stateData8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1712();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1666();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge128();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1035();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState137();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1192();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState42();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1598();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1339();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState391();
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState101();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1801();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1183();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter5.deserializeObjectState394();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter5.deserializeObjectState97();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter5.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter5.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter5.deserializeObjectState1921();
        boolean boolean11 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state4, state10);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1877();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState540();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState88();
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState674();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1823();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1503();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1326();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState456();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState550();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState476();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1974();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1737();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState457();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1871();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState282();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState845();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1183();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1866();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState563();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1985();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState674();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1982();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1326();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1581();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState373();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState272();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState615();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1480();
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState851();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        boolean boolean7 = stateData6.geteverBoarded();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1118();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState16();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState988();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1165();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState508();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState338();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1973();
        java.lang.Class<?> wildcardClass8 = state7.getClass();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState127();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge83();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState304();
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1717();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter7.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState425();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter7.deserializeObjectState661();
        boolean boolean13 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state6, state12);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1276();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1320();
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1722();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1498();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState150();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1743();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1873();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState366();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState141();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState476();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState525();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState181();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1245();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.StateData stateData7 = state6.stateData;
        org.opentripplanner.routing.core.ServiceDay serviceDay8 = stateData7.serviceDay;
        stateData7.setbikeParked(false);
        boolean boolean11 = stateData7.carParked;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNull(serviceDay8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState166();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState128();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1329();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState589();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1697();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1588();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.core.StateData stateData3 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData5 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1661();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1361();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState852();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1029();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1464();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(stateData3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState252();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState227();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState715();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState38();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState454();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState451();
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState689();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState851();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.core.StateData stateData3 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData4 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        stateData4.setzone("");
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1439();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1939();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge38();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1502();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState365();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState818();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1390();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState845();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1892();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter11.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter11.deserializeObjectState425();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter11.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter11.deserializeObjectState1398();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter11.deserializeObjectState1295();
        boolean boolean18 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state10, state17);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(streetEdge13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState396();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState273();
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState130();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState811();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState18();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1593();
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState937();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState998();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState1912();
        org.opentripplanner.routing.core.State state12 = state6.addToExistingResultChain(state11);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState90();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1838();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState860();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState674();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState269();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1853();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState844();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1364();
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
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1521();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState313();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState208();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
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
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState115();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex14();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1524();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1394();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState84();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState830();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter2 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter2.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter2.deserializeObjectState998();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter2.deserializeObjectState224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter2.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter2.deserializeObjectState58();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter2.deserializeObjectState1270();
        multiShortestPathTree1.postVisit(state8);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge110();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1867();
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1072();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState423();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState846();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState722();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1357();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState381();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState830();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1461();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState689();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1025();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1853();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1332();
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge51();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1752();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1717();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState523();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1384();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.trippattern.TripTimes tripTimes4 = state3.getTripTimes();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNull(tripTimes4);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState305();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState475();
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId2 = null;
        stateData1.settripId(agencyAndId2);
        boolean boolean4 = stateData1.carParked;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState45();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState250();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge31();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter4.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter4.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter4.deserializeObjectState261();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter4.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state11 = streetEdge3.optimisticTraverse(state10);
        java.lang.String str12 = streetEdge3.toString();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PlainStreetEdge(221, Prince Street, <osm:node:42433578 lat,lng=40.725382,-74.000101> -> <osm:node:42454423 lat,lng=40.725773,-74.000898> length=80.006 carSpeed=11.2 permission=ALL)" + "'", str12, "PlainStreetEdge(221, Prince Street, <osm:node:42433578 lat,lng=40.725382,-74.000101> -> <osm:node:42454423 lat,lng=40.725773,-74.000898> length=80.006 carSpeed=11.2 permission=ALL)");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter4.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1603();
        boolean boolean9 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state3, state8);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.ServiceDay serviceDay7 = null;
        stateData6.setserviceDay(serviceDay7);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState465();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1305();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1192();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState986();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState228();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState260();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1831();
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
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState81();
        java.util.Set<java.lang.String> strSet4 = state3.getBikeRentalNetworks();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNull(strSet4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge66();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState270();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState411();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState601();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1490();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState275();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1336();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState411();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState382();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1523();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1051();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1116();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1327();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1860();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState122();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1689();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState280();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1408();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState909();
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState850();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge133();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState508();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState338();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1973();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1094();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState505();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState497();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1226();
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
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge110();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter11.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge14 = serializedObjectSupporter11.deserializeObjectEdge59();
        state10.backEdge = streetEdge14;
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
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(streetEdge13);
        org.junit.Assert.assertNotNull(streetEdge14);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1697();
        int[] intArray9 = state8.pathParserStates;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1225();
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState166();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState854();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1053();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState39();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1513();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1183();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1652();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState719();
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1092();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1354();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1953();
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1594();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1298();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex13();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState836();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState481();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge51();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge58();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState486();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState104();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState757();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter8.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter8.deserializeObjectState295();
        org.opentripplanner.routing.core.StateData stateData14 = serializedObjectSupporter8.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter8.deserializeObjectState45();
        boolean boolean16 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state7, state15);
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
        org.junit.Assert.assertNotNull(stateData14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1877();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState540();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1116();
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1622();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState59();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState589();
        int int11 = state10.preTransitTime;
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState508();
        long long6 = state5.getTimeInMillis();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1638887234000L + "'", long6 == 1638887234000L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState677();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState439();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState774();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState687();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState264();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge69();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1738();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge111();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1761();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1154();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        stateData1.setstartTime((long) 'a');
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState421();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState512();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1995();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1183();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1954();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState238();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1881();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState844();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1501();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1055();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = null;
        state1.next = state2;
        int[] intArray10 = new int[] { ' ', 'a', 100, (short) -1, (byte) 1, '#' };
        state1.pathParserStates = intArray10;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 97, 100, -1, 1, 35]");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1519();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1132();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge79();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState553();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState181();
        int int6 = state5.getAbsTimeDeltaSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 57 + "'", int6 == 57);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex14();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1746();
        org.opentripplanner.routing.graph.Edge edge7 = state6.backEdge;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(edge7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState285();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter7.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState336();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter7.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter7.deserializeObjectState1647();
        org.opentripplanner.routing.core.StateData stateData14 = state13.stateData;
        org.opentripplanner.routing.core.ServiceDay serviceDay15 = stateData14.serviceDay;
        org.opentripplanner.routing.core.RoutingRequest routingRequest16 = stateData14.getopt();
        org.opentripplanner.routing.core.TraverseMode traverseMode17 = stateData14.getnonTransitMode();
        stateData6.setbackMode(traverseMode17);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(streetEdge12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(stateData14);
        org.junit.Assert.assertNull(serviceDay15);
        org.junit.Assert.assertNotNull(routingRequest16);
        org.junit.Assert.assertTrue("'" + traverseMode17 + "' != '" + org.opentripplanner.routing.core.TraverseMode.WALK + "'", traverseMode17.equals(org.opentripplanner.routing.core.TraverseMode.WALK));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1924();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1252();
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1298();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1762();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1649();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState105();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1295();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        double double6 = state5.walkDistance;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 763.3770000000002d + "'", double6 == 763.3770000000002d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1044();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter9 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter9.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter9.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter9.deserializeObjectState425();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter9.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter9.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter9.deserializeObjectState1600();
        boolean boolean16 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state8, state15);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge51();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge58();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1638();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState900();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1602();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1861();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1436();
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState365();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState432();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1400();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1894();
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState321();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1325();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex46();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1544();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState321();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1325();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1767();
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState677();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState439();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1542();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1512();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState285();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1105();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex20();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState216();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1188();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1045();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState157();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1092();
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState683();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState848();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState778();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1705();
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1862();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1491();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState14();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1691();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState691();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex14();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1524();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1394();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1804();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState536();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState423();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1949();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState250();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.trippattern.TripTimes tripTimes5 = stateData4.tripTimes;
        boolean boolean6 = stateData4.getbackWalkingBike();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNull(tripTimes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState411();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState601();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState457();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge14();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.opentripplanner.routing.core.RoutingRequest routingRequest0 = null;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree1 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest0);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap2 = null;
        multiShortestPathTree1.stateSets = vertexMap2;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = multiShortestPathTree1.getVertexCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState5();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1963();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex40();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState587();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState769();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState465();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1057();
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1206();
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
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray3 = null;
        stateData1.routeSequence = agencyAndIdArray3;
        int int5 = stateData1.lastNextArrivalDelta;
        org.opentripplanner.routing.trippattern.TripTimes tripTimes6 = stateData1.tripTimes;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(tripTimes6);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex44();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState284();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState493();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState59();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState130();
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1327();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1502();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState217();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1458();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState13();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState557();
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1154();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1974();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1110();
        org.opentripplanner.routing.core.State state8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state7, state8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState689();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1346();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1738();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState808();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState250();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState511();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState822();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1470();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState18();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState238();
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1731();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1627();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter4.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = stateData5.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        double double8 = streetEdge3.timeLowerBound(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState394();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter11.deserializeObjectState97();
        multiShortestPathTree10.serializedObjectSupporter = serializedObjectSupporter11;
        org.opentripplanner.routing.core.StateData stateData15 = serializedObjectSupporter11.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId16 = stateData15.tripId;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.247d + "'", double8 == 15.247d);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(stateData15);
        org.junit.Assert.assertNull(agencyAndId16);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge51();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge58();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1638();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState900();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge30();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1740();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        stateData1.setlastAlightedTime((long) 10);
        long long5 = stateData1.getlastAlightedTime();
        stateData1.setlastNextArrivalDelta((int) (short) 100);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge110();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1002();
        double double12 = state11.getWeightDelta();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 170.03000000000003d + "'", double12 == 170.03000000000003d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1438();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1855();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1372();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1397();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState106();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState260();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1226();
        org.junit.Assert.assertNotNull(stateData1);
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
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState409();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState377();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1400();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1069();
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1883();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1802();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState510();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState17();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray3 = null;
        stateData1.routeSequence = agencyAndIdArray3;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        stateData1.bikeRentalNetworks = strSet8;
        long long11 = stateData1.initialWaitTime;
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId12 = stateData1.route;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(agencyAndId12);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState235();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState285();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState388();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1731();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1392();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1943();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState319();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState461();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1205();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1700();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1266();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1762();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1649();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState105();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter7.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState1395();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter11.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge14 = serializedObjectSupporter11.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter11.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state16 = state10.addToExistingResultChain(state15);
        boolean boolean17 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state6, state10);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(streetEdge13);
        org.junit.Assert.assertNotNull(streetEdge14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1152();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1010();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState260();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState293();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1717();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState83();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        boolean boolean9 = state8.isBikeParked();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState39();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState601();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState16();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1925();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter6.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray8 = stateData7.getrouteSequence();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray9 = null;
        stateData7.routeSequence = agencyAndIdArray9;
        state5.stateData = stateData7;
        org.opentripplanner.routing.core.StateData stateData12 = stateData7.clone();
        stateData12.numBoardings = 0;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(agencyAndIdArray8);
        org.junit.Assert.assertNotNull(stateData12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex14();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1746();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1563();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1423();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1252();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState325();
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
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1082();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1775();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1378();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState755();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState282();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1594();
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1826();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1223();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1405();
        org.opentripplanner.routing.graph.Vertex vertex5 = state4.vertex;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(vertex5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState59();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1410();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1971();
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1921();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState741();
        java.lang.String str7 = state6.getZone();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        stateData1.setlastAlightedTime((long) 0);
        stateData1.setstartTime((long) 57);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId5 = state4.getRoute();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNull(agencyAndId5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState666();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState945();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState555();
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1345();
        boolean boolean6 = state5.isOnboard();
        int[] intArray7 = state5.pathParserStates;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1377();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState95();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1327();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1502();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState350();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1931();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState280();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState23();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState670();
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1721();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1311();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState978();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState475();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState260();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1574();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1573();
        double double9 = state8.getWalkDistanceDelta();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 63.57600000000002d + "'", double9 == 63.57600000000002d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter9 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter9.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter9.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter9.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter9.deserializeObjectState272();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter9.deserializeObjectState615();
        boolean boolean15 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state8, state14);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1398();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState992();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState396();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState194();
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState819();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge56();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId3 = stateData1.route;
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray4 = stateData1.routeSequence;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertNull(agencyAndId3);
        org.junit.Assert.assertNotNull(agencyAndIdArray4);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge41();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1326();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1581();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1163();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState663();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.StateData stateData7 = state6.stateData;
        org.opentripplanner.routing.core.ServiceDay serviceDay8 = stateData7.serviceDay;
        stateData7.lastAlightedTime = (byte) 0;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNull(serviceDay8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState59();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1145();
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1361();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1716();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1575();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1540();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray6 = new org.onebusaway.gtfs.model.AgencyAndId[] {};
        stateData5.setrouteSequence(agencyAndIdArray6);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(agencyAndIdArray6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1603();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1832();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState174();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1692();
        org.slf4j.Logger logger7 = state6.getLOG();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(logger7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter4.deserializeObjectState998();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter4.deserializeObjectState224();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1311();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter4.deserializeObjectVertex37();
        org.opentripplanner.routing.spt.GraphPath graphPath11 = multiShortestPathTree3.getPath((org.opentripplanner.routing.graph.Vertex) intersectionVertex9, false);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNull(graphPath11);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState76();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1848();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1629();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState516();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1973();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex36();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState442();
        org.opentripplanner.routing.edgetype.TripPattern tripPattern5 = state4.getLastPattern();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNull(tripPattern5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1479();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState893();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        boolean boolean5 = state4.isOnboard();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        stateData7.setlastTransitWalk((double) 2);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState305();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState292();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState240();
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState715();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1297();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1727();
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState497();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState561();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState505();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray3 = null;
        stateData1.routeSequence = agencyAndIdArray3;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        stateData1.bikeRentalNetworks = strSet8;
        long long11 = stateData1.initialWaitTime;
        stateData1.setbikeParked(true);
        boolean boolean14 = stateData1.getcarParked();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1210();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState711();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState318();
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData4 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.RoutingRequest routingRequest7 = multiShortestPathTree6.options;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest7);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNotNull(routingRequest7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1743();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1434();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState715();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState38();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState454();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1979();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1226();
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1535();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.StateData stateData7 = state6.stateData;
        org.onebusaway.gtfs.model.Stop stop8 = null;
        stateData7.setpreviousStop(stop8);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1092();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1354();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState63();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState423();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1519();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1729();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState524();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1870();
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState972();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1608();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1806();
        boolean boolean7 = state6.isBackWalkingBike();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState903();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1873();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState18();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState664();
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1026();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState618();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter5.deserializeObjectState757();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter5.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter5.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter5.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter5.deserializeObjectState1800();
        boolean boolean11 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state4, state10);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState715();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState38();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState454();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1979();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState729();
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1270();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState972();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.core.StateData stateData3 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter8.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter8.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter8.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter8.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter8.deserializeObjectState1595();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge15 = serializedObjectSupporter8.deserializeObjectEdge12();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex16 = serializedObjectSupporter8.deserializeObjectVertex15();
        java.util.List<org.opentripplanner.routing.spt.GraphPath> graphPathList18 = multiShortestPathTree7.getPaths((org.opentripplanner.routing.graph.Vertex) intersectionVertex16, true);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(streetEdge15);
        org.junit.Assert.assertNotNull(intersectionVertex16);
        org.junit.Assert.assertNotNull(graphPathList18);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState364();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1922();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState325();
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge110();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1780();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1319();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState236();
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
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1974();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState562();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState639();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1146();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1076();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1853();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1054();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState781();
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState632();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1057();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1638();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState669();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1065();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState234();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState965();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex14();
        int int5 = intersectionVertex4.getIndex();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52529 + "'", int5 == 52529);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState399();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState155();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1935();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1717();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState83();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1077();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge70();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1044();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState413();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1139();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex14();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1524();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1394();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1704();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState453();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState674();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState514();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState589();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1697();
        boolean boolean9 = state8.isFinal();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState589();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1697();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        java.util.Set<java.lang.String> strSet10 = stateData9.bikeRentalNetworks;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter4.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = stateData5.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        double double8 = streetEdge3.timeLowerBound(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState394();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter11.deserializeObjectState97();
        multiShortestPathTree10.serializedObjectSupporter = serializedObjectSupporter11;
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter11.deserializeObjectState1976();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter11.deserializeObjectState513();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.247d + "'", double8 == 15.247d);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge12();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState394();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter8.deserializeObjectState97();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState469();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState972();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter8.deserializeObjectState1608();
        boolean boolean14 = state13.multipleOptionsBefore();
        org.opentripplanner.routing.core.State state15 = streetEdge7.optimisticTraverse(state13);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter16 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter16.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge18 = serializedObjectSupporter16.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge19 = serializedObjectSupporter16.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state20 = serializedObjectSupporter16.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state21 = serializedObjectSupporter16.deserializeObjectState813();
        org.opentripplanner.routing.core.State state22 = serializedObjectSupporter16.deserializeObjectState747();
        org.opentripplanner.routing.core.State state23 = serializedObjectSupporter16.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state24 = serializedObjectSupporter16.deserializeObjectState1044();
        org.opentripplanner.routing.core.State state25 = serializedObjectSupporter16.deserializeObjectState413();
        org.opentripplanner.routing.core.State state26 = streetEdge7.traverse(state25);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(state15);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(streetEdge18);
        org.junit.Assert.assertNotNull(streetEdge19);
        org.junit.Assert.assertNotNull(state20);
        org.junit.Assert.assertNotNull(state21);
        org.junit.Assert.assertNotNull(state22);
        org.junit.Assert.assertNotNull(state23);
        org.junit.Assert.assertNotNull(state24);
        org.junit.Assert.assertNotNull(state25);
        org.junit.Assert.assertNull(state26);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState429();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1411();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1359();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1743();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1873();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState669();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1239();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState501();
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge88();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState732();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1378();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1309();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1044();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState413();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState937();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1029();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState832();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(stateData3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState184();
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1512();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter5.deserializeObjectState757();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter5.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter5.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter5.deserializeObjectState734();
        boolean boolean10 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state4, state9);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1917();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1886();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex11();
        intersectionVertex8.removeAllEdges();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter10.deserializeObjectState757();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter10.deserializeObjectState730();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter10.deserializeObjectState412();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter10.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData15 = serializedObjectSupporter10.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData16 = serializedObjectSupporter10.deserializeObjectStateData2();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex17 = serializedObjectSupporter10.deserializeObjectVertex38();
        double double18 = intersectionVertex8.azimuthTo((org.opentripplanner.routing.graph.Vertex) intersectionVertex17);
        com.vividsolutions.jts.geom.Coordinate coordinate19 = intersectionVertex17.getCoordinate();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(stateData15);
        org.junit.Assert.assertNotNull(stateData16);
        org.junit.Assert.assertNotNull(intersectionVertex17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-147.43774270244438d) + "'", double18 == (-147.43774270244438d));
        org.junit.Assert.assertNotNull(coordinate19);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge18();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState466();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState7();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1515();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge129();
        boolean boolean6 = streetEdge5.vertexTypesValid();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1253();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState471();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1211();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState619();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1838();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState550();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge18();
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
        org.junit.Assert.assertNotNull(streetEdge12);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState712();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1780();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState881();
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1082();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState863();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState411();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState601();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1180();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1000();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState995();
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1327();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1502();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState601();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge6();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState428();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState454();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1201();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1377();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState209();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1235();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState282();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1834();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.opentripplanner.routing.core.TraverseMode traverseMode3 = null;
        stateData1.setbackMode(traverseMode3);
        stateData1.carParked = true;
        stateData1.seteverBoarded(false);
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId9 = null;
        stateData1.setroute(agencyAndId9);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState922();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1674();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState402();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState523();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1205();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1700();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge9();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge39();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1094();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState252();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState558();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = state5.getOptions();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(routingRequest6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState435();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState384();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1874();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState614();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1028();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter6.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter6.deserializeObjectState425();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter6.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter6.deserializeObjectState1379();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter6.deserializeObjectState602();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter6.deserializeObjectState1689();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge14 = serializedObjectSupporter6.deserializeObjectEdge122();
        state5.backEdge = streetEdge14;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(streetEdge14);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1162();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState835();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1171();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1040();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState284();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState551();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState18();
        int int9 = state8.getNumBoardings();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1051();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState9();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex12();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1879();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1618();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState103();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState489();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1438();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState296();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState172();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData2();
        boolean boolean10 = stateData9.getusingRentedBike();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState841();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1044();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState413();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState316();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1298();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex13();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge91();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState591();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1494();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState124();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState117();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge80();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState850();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1379();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1340();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState554();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState25();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState736();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter10.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter10.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter10.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter10.deserializeObjectState685();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter10.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter10.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter10.deserializeObjectState642();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter10.deserializeObjectState188();
        org.opentripplanner.routing.core.State state19 = serializedObjectSupporter10.deserializeObjectState1123();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter20 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state21 = serializedObjectSupporter20.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge22 = serializedObjectSupporter20.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge23 = serializedObjectSupporter20.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state24 = serializedObjectSupporter20.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state25 = serializedObjectSupporter20.deserializeObjectState989();
        org.opentripplanner.routing.core.State state26 = serializedObjectSupporter20.deserializeObjectState1065();
        boolean boolean27 = state19.routeSequencePrefix(state26);
        boolean boolean28 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state9, state26);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(streetEdge12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertNotNull(state19);
        org.junit.Assert.assertNotNull(state21);
        org.junit.Assert.assertNotNull(streetEdge22);
        org.junit.Assert.assertNotNull(streetEdge23);
        org.junit.Assert.assertNotNull(state24);
        org.junit.Assert.assertNotNull(state25);
        org.junit.Assert.assertNotNull(state26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1917();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1740();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState818();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge111();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1246();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState64();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState280();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1408();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1732();
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState434();
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
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1979();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1506();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1253();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState29();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState438();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState493();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1188();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState798();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1502();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1176();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState933();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState855();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1411();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState683();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge47();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState174();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState893();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState748();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState133();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1738();
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState543();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1561();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState303();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1110();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1890();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState305();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState986();
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter4.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = stateData5.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        double double8 = streetEdge3.timeLowerBound(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState394();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter11.deserializeObjectState97();
        multiShortestPathTree10.serializedObjectSupporter = serializedObjectSupporter11;
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter11.deserializeObjectState784();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.247d + "'", double8 == 15.247d);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state15);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState260();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState826();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1306();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        stateData1.setlastAlightedTime((long) 10);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter5.deserializeObjectState757();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter5.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter5.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter5.deserializeObjectState511();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter5.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest11 = stateData10.opt;
        stateData1.opt = routingRequest11;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(stateData10);
        org.junit.Assert.assertNotNull(routingRequest11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1398();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState601();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState316();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1465();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge116();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1887();
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState157();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState766();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState492();
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.StateData stateData7 = state6.stateData;
        org.opentripplanner.routing.core.ServiceDay serviceDay8 = stateData7.serviceDay;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = stateData7.getopt();
        org.opentripplanner.routing.core.ServiceDay serviceDay10 = stateData7.getserviceDay();
        stateData7.carParked = false;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNull(serviceDay8);
        org.junit.Assert.assertNotNull(routingRequest9);
        org.junit.Assert.assertNull(serviceDay10);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState961();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1144();
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1466();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1402();
        org.opentripplanner.routing.graph.Vertex vertex10 = state9.vertex;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(vertex10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1253();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState29();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState433();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1489();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState791();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1550();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(stateData2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge12();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex15();
        java.lang.String str9 = intersectionVertex8.getLabel();
        int int10 = intersectionVertex8.getDegreeIn();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "osm:node:42449576" + "'", str9, "osm:node:42449576");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge131();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState642();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1855();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState317();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1561();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1118();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState16();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1710();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1927();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.StateData stateData7 = state6.stateData;
        org.opentripplanner.routing.core.ServiceDay serviceDay8 = stateData7.serviceDay;
        org.opentripplanner.routing.core.RoutingRequest routingRequest9 = stateData7.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
        org.opentripplanner.routing.core.StateData stateData11 = new org.opentripplanner.routing.core.StateData(routingRequest9);
        org.opentripplanner.routing.core.StateData stateData12 = new org.opentripplanner.routing.core.StateData(routingRequest9);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNull(serviceDay8);
        org.junit.Assert.assertNotNull(routingRequest9);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState115();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState787();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter8.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest10 = stateData9.getopt();
        org.opentripplanner.routing.core.StateData stateData11 = new org.opentripplanner.routing.core.StateData(routingRequest10);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest10);
        java.util.Map<org.opentripplanner.routing.graph.Vertex, java.util.List<org.opentripplanner.routing.core.State>> vertexMap13 = multiShortestPathTree12.getstateSets();
        multiShortestPathTree7.setstateSets(vertexMap13);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertNotNull(routingRequest10);
        org.junit.Assert.assertNotNull(vertexMap13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1424();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1917();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1740();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState240();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1727();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge116();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }
}
