import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState526();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState465();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray3 = null;
        stateData1.routeSequence = agencyAndIdArray3;
        int int5 = stateData1.lastNextArrivalDelta;
        java.lang.String str6 = stateData1.zone;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        stateData4.startTime = 'a';
        org.opentripplanner.routing.core.ServiceDay serviceDay7 = stateData4.serviceDay;
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray8 = stateData4.getrouteSequence();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNull(serviceDay7);
        org.junit.Assert.assertNotNull(agencyAndIdArray8);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState123();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1188();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1581();
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState80();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState626();
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState922();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge143();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1710();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge18();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState466();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1432();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState360();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState432();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState803();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1533();
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState712();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1278();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState735();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1741();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState481();
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState544();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState678();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1327();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1198();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1973();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1639();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState485();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1197();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1092();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1354();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState683();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState423();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1465();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState445();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState337();
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1209();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState409();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex7();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1866();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1837();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1117();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState76();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1943();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1162();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1789();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1209();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState409();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex7();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1419();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState112();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState991();
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1057();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1638();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1733();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState598();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1994();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1801();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState263();
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
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState850();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1379();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1729();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1551();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState610();
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState182();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        boolean boolean8 = stateData7.backWalkingBike;
        java.util.Set<java.lang.String> strSet9 = stateData7.bikeRentalNetworks;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState39();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState601();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState16();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge30();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState525();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1849();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1192();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState624();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState519();
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState677();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState50();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState365();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState818();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1609();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1377();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState209();
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1820();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1487();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge94();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState526();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState140();
        long long10 = state9.getTimeSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1638887144L + "'", long10 == 1638887144L);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState399();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState366();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1022();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1187();
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1610();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState142();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState707();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState1299();
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
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge99();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1600();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge99();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1155();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1952();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1792();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData4 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData5 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.onebusaway.gtfs.model.Trip trip6 = null;
        stateData5.previousTrip = trip6;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState850();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1379();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState718();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState885();
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
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState280();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1003();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState873();
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1802();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState510();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter8.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState685();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter8.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter8.deserializeObjectState590();
        boolean boolean15 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state7, state14);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState733();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState539();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1800();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge25();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.opentripplanner.routing.core.TraverseMode traverseMode3 = null;
        stateData1.setbackMode(traverseMode3);
        stateData1.carParked = true;
        stateData1.seteverBoarded(false);
        org.opentripplanner.routing.edgetype.TripPattern tripPattern9 = stateData1.lastPattern;
        stateData1.setbikeParked(true);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertNull(tripPattern9);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState268();
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex19();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState757();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter6.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter6.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter6.deserializeObjectState500();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter6.deserializeObjectState275();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter6.deserializeObjectEdge80();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter14 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData15 = serializedObjectSupporter14.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter14.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge17 = serializedObjectSupporter14.deserializeObjectEdge3();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter18 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData19 = serializedObjectSupporter18.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest20 = stateData19.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree21 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        double double22 = streetEdge17.timeLowerBound(routingRequest20);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree23 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree24 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree25 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.core.StateData stateData26 = new org.opentripplanner.routing.core.StateData(routingRequest20);
        org.opentripplanner.routing.core.State state27 = new org.opentripplanner.routing.core.State((org.opentripplanner.routing.graph.Vertex) intersectionVertex5, (org.opentripplanner.routing.graph.Edge) streetEdge12, 0L, routingRequest20);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree28 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree29 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest20);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(streetEdge12);
        org.junit.Assert.assertNotNull(stateData15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(streetEdge17);
        org.junit.Assert.assertNotNull(stateData19);
        org.junit.Assert.assertNotNull(routingRequest20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.247d + "'", double22 == 15.247d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1798();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState792();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState628();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState543();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1013();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1921();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState48();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1533();
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.TraverseMode traverseMode5 = stateData4.backMode;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertTrue("'" + traverseMode5 + "' != '" + org.opentripplanner.routing.core.TraverseMode.WALK + "'", traverseMode5.equals(org.opentripplanner.routing.core.TraverseMode.WALK));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState313();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1651();
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex14();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1746();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState125();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState48();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1730();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState592();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1228();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1519();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState242();
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState519();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge39();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1026();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState465();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1398();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState603();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState170();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState300();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState107();
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1956();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1861();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1767();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        stateData1.setlastAlightedTime((long) 0);
        org.opentripplanner.routing.trippattern.TripTimes tripTimes5 = stateData1.gettripTimes();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertNull(tripTimes5);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1996();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge51();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge58();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1120();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1945();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        state3.dumpPath();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1802();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState184();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState365();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState818();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1369();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState628();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1881();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState604();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState27();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState477();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState587();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.core.StateData stateData12 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.core.ServiceDay serviceDay13 = stateData12.serviceDay;
        stateData12.carParked = true;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.247d + "'", double8 == 15.247d);
        org.junit.Assert.assertNull(serviceDay13);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState570();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge12();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex1();
        int int12 = intersectionVertex11.removeTemporaryEdges();
        java.lang.String str13 = intersectionVertex11.toString();
        double double14 = intersectionVertex11.getLon();
        double double15 = intersectionVertex11.getX();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(intersectionVertex11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<osm:node:42436788 lat,lng=40.7273716,-74.0005643>" + "'", str13, "<osm:node:42436788 lat,lng=40.7273716,-74.0005643>");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-74.0005643d) + "'", double14 == (-74.0005643d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-74.0005643d) + "'", double15 == (-74.0005643d));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1622();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState181();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1464();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1668();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1405();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        org.opentripplanner.routing.core.StateData stateData10 = new org.opentripplanner.routing.core.StateData(routingRequest9);
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState340();
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1379();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState602();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1689();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1125();
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex20();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1337();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.core.StateData stateData3 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.slf4j.Logger logger7 = multiShortestPathTree6.getLOG();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNotNull(logger7);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1440();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1743();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1873();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1786();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1861();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1210();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState242();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1414();
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex5();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState176();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex15();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge31();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(intersectionVertex10);
        org.junit.Assert.assertNotNull(streetEdge11);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1921();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState127();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState75();
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState554();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState25();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1860();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState590();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1494();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState362();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter11.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter11.deserializeObjectState425();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter11.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter11.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter11.deserializeObjectState1600();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter11.deserializeObjectState850();
        boolean boolean19 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state10, state18);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(streetEdge13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState522();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1546();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1647();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState8();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState724();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1519();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1561();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1256();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState411();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1173();
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState364();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1922();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState289();
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1820();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState989();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState36();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1357();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState425();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1973();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState146();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState680();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState57();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1233();
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState12();
        long long7 = state6.getLastAlightedTimeSeconds();
        org.opentripplanner.routing.core.State state10 = state6.optimizeOrReverse(false, false);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1826();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1601();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1827();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState21();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter6.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter6.deserializeObjectEdge59();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData11 = serializedObjectSupporter10.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = stateData11.getopt();
        org.opentripplanner.routing.core.StateData stateData13 = new org.opentripplanner.routing.core.StateData(routingRequest12);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        double double15 = streetEdge9.timeLowerBound(routingRequest12);
        state5.backEdge = streetEdge9;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(stateData11);
        org.junit.Assert.assertNotNull(routingRequest12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 14.75d + "'", double15 == 14.75d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState598();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState350();
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1209();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState409();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1117();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1147();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1271();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState225();
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
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState614();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState621();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState994();
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState329();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState526();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState161();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState140();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(stateData10);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest9);
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState250();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1870();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1327();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1327();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1860();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1003();
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1466();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState215();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1333();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState521();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1510();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge130();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState364();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1356();
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex31();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState658();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge32();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState772();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.opentripplanner.routing.core.TraverseMode traverseMode3 = null;
        stateData1.setbackMode(traverseMode3);
        stateData1.carParked = true;
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter7.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter7.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter7.deserializeObjectState989();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter7.deserializeObjectState411();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter7.deserializeObjectState601();
        org.opentripplanner.routing.core.TraverseMode traverseMode15 = state14.getBackMode();
        stateData1.nonTransitMode = traverseMode15;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertTrue("'" + traverseMode15 + "' != '" + org.opentripplanner.routing.core.TraverseMode.WALK + "'", traverseMode15.equals(org.opentripplanner.routing.core.TraverseMode.WALK));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1491();
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1210();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge31();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter8.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState685();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter8.deserializeObjectState1201();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex14 = serializedObjectSupporter8.deserializeObjectVertex39();
        streetEdge7.attachFrom((org.opentripplanner.routing.graph.Vertex) intersectionVertex14);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(intersectionVertex14);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState554();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge51();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1423();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState44();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState910();
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1209();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState409();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1537();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1910();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter6.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter6.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter6.deserializeObjectState252();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter6.deserializeObjectState558();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = state11.getOptions();
        stateData5.setopt(routingRequest12);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        multiShortestPathTree14.dump();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(routingRequest12);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1326();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1581();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1163();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex22();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1477();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1556();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1637();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.core.StateData stateData3 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData4 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState394();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter6.deserializeObjectState97();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter6.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter6.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter6.deserializeObjectState1126();
        boolean boolean12 = multiShortestPathTree5.add(state11);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(stateData10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState792();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState801();
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId2 = null;
        stateData1.settripId(agencyAndId2);
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId4 = stateData1.route;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNull(agencyAndId4);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1898();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1692();
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
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState511();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState45();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState783();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState570();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge12();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex1();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1519();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(intersectionVertex11);
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.opentripplanner.routing.core.State state0 = null;
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter1 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter1.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter1.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter1.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter1.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter1.deserializeObjectState813();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state0, state6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData4 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState18();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState235();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1542();
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState50();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1264();
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1665();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1719();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1790();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState28();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState380();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1896();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState358();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1161();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState210();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1438();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState619();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState444();
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
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState554();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1294();
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1092();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState293();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState779();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState260();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState906();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState770();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1154();
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState120();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1357();
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState479();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1365();
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1542();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge12();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1564();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState540();
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
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.core.StateData stateData3 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData4 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        int int5 = stateData4.getlastNextArrivalDelta();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1931();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1303();
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1900();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1860();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId3 = stateData1.route;
        stateData1.everBoarded = true;
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertNull(agencyAndId3);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState468();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1844();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1328();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge84();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1298();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex5 = serializedObjectSupporter0.deserializeObjectVertex13();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState526();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(intersectionVertex5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1339();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState641();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState846();
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState489();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1957();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge116();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1890();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex9 = serializedObjectSupporter0.deserializeObjectVertex30();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1466();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(intersectionVertex9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState587();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1661();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState370();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1431();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState435();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.core.StateData stateData3 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree9 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState973();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState474();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1296();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1504();
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState235();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1266();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter10 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter10.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter10.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter10.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter10.deserializeObjectState56();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter10.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter10.deserializeObjectState463();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter10.deserializeObjectState1339();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter10.deserializeObjectState641();
        boolean boolean19 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state9, state18);
        double double20 = state18.getWeightDelta();
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
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 157.36199999999997d + "'", double20 == 157.36199999999997d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState474();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1528();
        org.opentripplanner.routing.core.TraverseMode traverseMode9 = state8.getNonTransitMode();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertTrue("'" + traverseMode9 + "' != '" + org.opentripplanner.routing.core.TraverseMode.WALK + "'", traverseMode9.equals(org.opentripplanner.routing.core.TraverseMode.WALK));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1326();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1181();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1382();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1051();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState9();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1245();
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState748();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1599();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState219();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1900();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        stateData4.usingRentedBike = false;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1660();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1069();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1151();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState48();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState538();
        org.opentripplanner.routing.graph.Vertex vertex7 = state6.getVertex();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(vertex7);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1083();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1756();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState157();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState84();
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1146();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState757();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter6.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter6.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter6.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter6.deserializeObjectState508();
        long long12 = state11.getTimeInMillis();
        boolean boolean13 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state5, state11);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1638887234000L + "'", long12 == 1638887234000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge116();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1890();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState51();
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
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState399();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState366();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1037();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1304();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1036();
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
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1591();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1312();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState193();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1969();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState589();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState824();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1695();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState570();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge12();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState757();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter11.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter11.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter11.deserializeObjectState1930();
        org.opentripplanner.routing.core.StateData stateData16 = serializedObjectSupporter11.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter11.deserializeObjectState1898();
        org.opentripplanner.routing.core.State state18 = streetEdge10.optimisticTraverse(state17);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(stateData16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNull(state18);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState166();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState854();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1833();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState674();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1377();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState644();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1467();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState252();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState975();
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1731();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1024();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1661();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1428();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1245();
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
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1614();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState170();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1393();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge90();
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState76();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1848();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1251();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState984();
        org.junit.Assert.assertNotNull(stateData1);
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1348();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1502();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1762();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1649();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState105();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState966();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState142();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1275();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1621();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1982();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState80();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1672();
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1345();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState590();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1494();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1133();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge88();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertNotNull(streetEdge10);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1282();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        org.opentripplanner.routing.core.State state11 = state10.optimize();
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
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState670();
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1253();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1711();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1010();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState437();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1955();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1153();
        double double4 = state3.getWalkDistanceDelta();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 14.850000000000023d + "'", double4 == 14.850000000000023d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1533();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState771();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1366();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState992();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1837();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1158();
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1943();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState527();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState658();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        stateData7.setlastAlightedTime((long) '4');
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1921();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState48();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState926();
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState302();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState797();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1732();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        boolean boolean8 = stateData7.backWalkingBike;
        boolean boolean9 = stateData7.usingRentedBike;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState444();
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
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray2 = stateData1.getrouteSequence();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray3 = null;
        stateData1.routeSequence = agencyAndIdArray3;
        int int5 = stateData1.lastNextArrivalDelta;
        stateData1.setusingRentedBike(false);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(agencyAndIdArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1956();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState706();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState115();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1220();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge104();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1651();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState769();
        boolean boolean11 = state10.isCarParked();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState44();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1327();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState121();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter9 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter9.deserializeObjectState757();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter9.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter9.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter9.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter9.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex15 = serializedObjectSupporter9.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter9.deserializeObjectState5();
        org.opentripplanner.routing.core.StateData stateData17 = serializedObjectSupporter9.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter9.deserializeObjectState1046();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex19 = serializedObjectSupporter9.deserializeObjectVertex15();
        state8.vertex = intersectionVertex19;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(intersectionVertex15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(stateData17);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertNotNull(intersectionVertex19);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState5();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1906();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState461();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState660();
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1890();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1205();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1700();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter6.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter6.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter6.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter6.deserializeObjectState989();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter6.deserializeObjectState411();
        boolean boolean13 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state5, state12);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = state4.getOptions();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter7.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState425();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter7.deserializeObjectState61();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter7.deserializeObjectState1178();
        org.opentripplanner.routing.core.StateData stateData14 = serializedObjectSupporter7.deserializeObjectStateData1();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex15 = serializedObjectSupporter7.deserializeObjectVertex11();
        intersectionVertex15.removeAllEdges();
        java.util.List<org.opentripplanner.routing.core.State> stateList17 = multiShortestPathTree6.getStates((org.opentripplanner.routing.graph.Vertex) intersectionVertex15);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(routingRequest5);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(stateData14);
        org.junit.Assert.assertNotNull(intersectionVertex15);
        org.junit.Assert.assertNull(stateList17);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1820();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1466();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1633();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState470();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1614();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState170();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState434();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1525();
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState174();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1692();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1118();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState272();
        double double5 = state4.getWeight();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 731.4209999999999d + "'", double5 == 731.4209999999999d);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1945();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1029();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState769();
        org.opentripplanner.routing.core.State state11 = state10.next;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNull(state11);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState484();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1561();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState94();
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1572();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1215();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1660();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState58();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState39();
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
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex27();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge16 = serializedObjectSupporter11.deserializeObjectEdge55();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter17 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter17.deserializeObjectState1996();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge19 = serializedObjectSupporter17.deserializeObjectEdge51();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge20 = serializedObjectSupporter17.deserializeObjectEdge105();
        boolean boolean21 = streetEdge16.isReverseOf((org.opentripplanner.routing.graph.Edge) streetEdge20);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.247d + "'", double8 == 15.247d);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(stateData15);
        org.junit.Assert.assertNotNull(streetEdge16);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertNotNull(streetEdge19);
        org.junit.Assert.assertNotNull(streetEdge20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState263();
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState177();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1674();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1358();
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState933();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1199();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1815();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState459();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        ch.qos.logback.classic.Logger logger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(logger5);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1079();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1080();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState891();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState380();
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState945();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1427();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1146();
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1717();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState83();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1168();
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge119();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1082();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState905();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1245();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1572();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState127();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge58();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1168();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1346();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState846();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState339();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState691();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState250();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState269();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1245();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState76();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1848();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1251();
        java.lang.String str8 = state7.toStringVerbose();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<State Tue Dec 07 11:29:00 BRT 2021 w=705.606 t=710 d=656.1060000000001 p=0 b=0 br=false pr=false>" + "'", str8, "<State Tue Dec 07 11:29:00 BRT 2021 w=705.606 t=710 d=656.1060000000001 p=0 b=0 br=false pr=false>");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState280();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1003();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState763();
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState48();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState538();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1672();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1403();
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState526();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1315();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState59();
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState886();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1421();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState227();
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState235();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1266();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState105();
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
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState681();
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState62();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState52();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.core.StateData stateData3 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.core.StateData stateData6 = new org.opentripplanner.routing.core.StateData(routingRequest2);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge16 = serializedObjectSupporter11.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter11.deserializeObjectState669();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter11.deserializeObjectState527();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.247d + "'", double8 == 15.247d);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(stateData15);
        org.junit.Assert.assertNotNull(streetEdge16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(state18);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1411();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState817();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(stateData3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1614();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1329();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState791();
        org.opentripplanner.routing.core.StateData stateData2 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1010();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(stateData2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1758();
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
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1677();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState901();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge139();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState326();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge18();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState590();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1802();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState510();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1191();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState510();
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1116();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState731();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState5();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState163();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge74();
        boolean boolean10 = streetEdge9.isPartial();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1519();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState524();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState800();
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1266();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1433();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1973();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1639();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1455();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap5 = null;
        stateData4.setextensions(objMap5);
        boolean boolean7 = stateData4.getbackWalkingBike();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState174();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState257();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState540();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState268();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState174();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1692();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1786();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1395();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1666();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState859();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge120();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState179();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1940();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState358();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1354();
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter12 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter12.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter12.deserializeObjectState998();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter12.deserializeObjectState224();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter12.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter12.deserializeObjectState58();
        boolean boolean18 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state10, state17);
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
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1468();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState280();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1408();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState854();
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1298();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1736();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1348();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.core.State state3 = state2.getNextResult();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter4.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter4.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter4.deserializeObjectState989();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter4.deserializeObjectState39();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter4.deserializeObjectState601();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter4.deserializeObjectState16();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge13 = serializedObjectSupporter4.deserializeObjectEdge30();
        // The following exception was thrown during execution in test generation
        try {
            org.opentripplanner.routing.core.StateEditor stateEditor14 = state3.edit((org.opentripplanner.routing.graph.Edge) streetEdge13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNull(state3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(streetEdge13);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState802();
        boolean boolean8 = state7.multipleOptionsBefore();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState411();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState783();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge75();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1921();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState127();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState366();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1228();
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
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState715();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1298();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1717();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1197();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState360();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1955();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState423();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1465();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState350();
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
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState474();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1528();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1491();
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1092();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1354();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState528();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState513();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState912();
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState411();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState715();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState38();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState120();
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.trippattern.TripTimes tripTimes7 = null;
        stateData6.settripTimes(tripTimes7);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1215();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex14();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState156();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState23();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1809();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1242();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1861();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1812();
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState946();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1178();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState328();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1677();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1005();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray9 = stateData8.routeSequence;
        org.onebusaway.gtfs.model.AgencyAndId agencyAndId10 = null;
        stateData8.settripId(agencyAndId10);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(agencyAndIdArray9);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState392();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.onebusaway.gtfs.model.Stop stop4 = stateData3.getpreviousStop();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(stateData3);
        org.junit.Assert.assertNull(stop4);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState589();
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge73();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1420();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge16 = serializedObjectSupporter11.deserializeObjectEdge55();
        double double17 = streetEdge16.getDistance();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.247d + "'", double8 == 15.247d);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(stateData15);
        org.junit.Assert.assertNotNull(streetEdge16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 160.493d + "'", double17 == 160.493d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1602();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState106();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState82();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState866();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState893();
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState12();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1450();
        state7.preTransitTime = (byte) -1;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState88();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState54();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1289();
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1210();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState268();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1028();
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = stateData5.getextensions();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNull(objMap6);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState743();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState67();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1378();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1786();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.StateData stateData6 = stateData5.clone();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(stateData6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState798();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1283();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.ServiceDay serviceDay7 = stateData6.getserviceDay();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNull(serviceDay7);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1205();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState328();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1209();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState409();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1276();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState712();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1780();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState398();
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState188();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1082();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState846();
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
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1059();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState287();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState311();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1648();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge6();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState414();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1260();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState297();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1225();
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = state4.getOptions();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(routingRequest5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1026();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState793();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter5 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter5.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter5.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter5.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter5.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter5.deserializeObjectState989();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter5.deserializeObjectState411();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter5.deserializeObjectState601();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter5.deserializeObjectState1490();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter5.deserializeObjectState275();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter5.deserializeObjectState234();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter5.deserializeObjectState879();
        state4.next = state16;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState426();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1264();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState594();
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
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1317();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState850();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1379();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1729();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1551();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState18();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState660();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState818();
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter4.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter4.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter4.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter4.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter4.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter4.deserializeObjectState1717();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter4.deserializeObjectState83();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter4.deserializeObjectState1077();
        boolean boolean13 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state3, state12);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState589();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1697();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1650();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1176();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1065();
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1327();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState121();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1949();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1481();
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState358();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1655();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1850();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState158();
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1380();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1855();
        long long6 = state5.getElapsedTimeSeconds();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 425L + "'", long6 == 425L);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState589();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex9();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState986();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState376();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest2 = stateData1.getopt();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree3 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree4 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree5 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest2);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter6.deserializeObjectVertex11();
        intersectionVertex8.removeAllEdges();
        org.opentripplanner.routing.core.State state10 = multiShortestPathTree5.getState((org.opentripplanner.routing.graph.Vertex) intersectionVertex8);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter11 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter11.deserializeObjectState757();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex13 = serializedObjectSupporter11.deserializeObjectVertex20();
        org.opentripplanner.routing.spt.GraphPath graphPath15 = multiShortestPathTree5.getPath((org.opentripplanner.routing.graph.Vertex) intersectionVertex13, true);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(routingRequest2);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNull(state10);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(intersectionVertex13);
        org.junit.Assert.assertNull(graphPath15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1124();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState463();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1339();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1526();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState903();
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState115();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1318();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState486();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState260();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1625();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1900();
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState927();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1762();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState372();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState633();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState1264();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState197();
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
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState630();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState399();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState366();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1022();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState112();
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState5();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1046();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1503();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1222();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge4();
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
        org.junit.Assert.assertNotNull(streetEdge12);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState840();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1887();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState500();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState275();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1496();
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1573();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1956();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState796();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState505();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(streetEdge11);
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1180();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1973();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1639();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1634();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState957();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1800();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        stateData5.setusingRentedBike(false);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState945();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState702();
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState21();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge18();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState466();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState7();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1656();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1861();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1111();
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge12();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState198();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1597();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState674();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1375();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1827();
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1758();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState567();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1538();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState779();
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1312();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState576();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState200();
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter4.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = stateData5.getopt();
        org.opentripplanner.routing.core.StateData stateData7 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        double double9 = streetEdge3.timeLowerBound(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree10 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.core.StateData stateData11 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 14.75d + "'", double9 == 14.75d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState120();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1137();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1850();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState585();
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
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState252();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge116();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState555();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState885();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1377();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1817();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState174();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState358();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState423();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1465();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState445();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState568();
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState321();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState566();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState970();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState543();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState334();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState881();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState326();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1427();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState405();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1311();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1591();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState591();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1987();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState945();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1067();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1826();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1601();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState359();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState224();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.onebusaway.gtfs.model.Stop stop5 = stateData4.getpreviousStop();
        stateData4.carParked = true;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNull(stop5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1466();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1127();
        org.opentripplanner.routing.core.StateData stateData10 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.onebusaway.gtfs.model.AgencyAndId[] agencyAndIdArray11 = stateData10.getrouteSequence();
        org.onebusaway.gtfs.model.Stop stop12 = null;
        stateData10.setpreviousStop(stop12);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(stateData10);
        org.junit.Assert.assertNotNull(agencyAndIdArray11);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1968();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState584();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState715();
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
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState252();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState558();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = state5.getOptions();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.core.StateData stateData8 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.core.StateData stateData9 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.core.ServiceDay serviceDay10 = stateData9.getserviceDay();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertNull(serviceDay10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1367();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1595();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge12();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState432();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState455();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1946();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1641();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1578();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState229();
        int int5 = state4.getPreTransitTimeDelta();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1454();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1025();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1207();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1452();
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1423();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState367();
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1533();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState771();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState835();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1716();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1575();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex39();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState945();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1333();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1831();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1201();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1350();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1470();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState271();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState460();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1072();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState717();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter8.deserializeObjectState498();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState1392();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState1();
        boolean boolean13 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state7, state12);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState252();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge116();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState50();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState102();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge109();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1183();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1866();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState563();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1665();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int int0 = org.opentripplanner.routing.graph.Vertex.getMaxIndex();
// flaky:         org.junit.Assert.assertTrue("'" + int0 + "' != '" + 88777 + "'", int0 == 88777);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState166();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState380();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1051();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1887();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState489();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1718();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge17();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState614();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1860();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1795();
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1092();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState293();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge53();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState305();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge115();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1055();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1150();
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1973();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1741();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1196();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1414();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState511();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = stateData5.opt;
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1141();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState252();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState558();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = state5.getOptions();
        org.opentripplanner.routing.core.StateData stateData7 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.core.StateData stateData8 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(routingRequest6);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1791();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState544();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1228();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = state4.getOptions();
        org.opentripplanner.routing.core.StateData stateData6 = new org.opentripplanner.routing.core.StateData(routingRequest5);
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
        stateData6.nonTransitMode = traverseMode17;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(routingRequest5);
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1111();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1787();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(streetEdge8);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1378();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1786();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState478();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1479();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState996();
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState305();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge115();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1332();
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1178();
        org.opentripplanner.routing.core.StateData stateData7 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1952();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1503();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(stateData7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1092();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1354();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState189();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState528();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState513();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge63();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex11 = serializedObjectSupporter0.deserializeObjectVertex27();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter0.deserializeObjectState878();
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
        org.junit.Assert.assertNotNull(intersectionVertex11);
        org.junit.Assert.assertNotNull(state12);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState683();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1467();
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1973();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1866();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState87();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1993();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1570();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState945();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge15();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1494();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState124();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1409();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState846();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState339();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1841();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState680();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1675();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1131();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState130();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState623();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState98();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1209();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState409();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex7();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1866();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState77();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState766();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState166();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState458();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1349();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1979();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState544();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1106();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1845();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1282();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState330();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge116();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState859();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState256();
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1817();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState285();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1167();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState5();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        boolean boolean9 = stateData8.getbikeParked();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(intersectionVertex6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.StateData stateData3 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex4 = serializedObjectSupporter0.deserializeObjectVertex46();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(stateData3);
        org.junit.Assert.assertNotNull(intersectionVertex4);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState365();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState788();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1220();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState942();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        boolean boolean3 = state2.allPathParsersAccept();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState235();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1266();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState100();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1435();
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
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState526();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState642();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1315();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState942();
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState284();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState118();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState722();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState804();
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter6 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter6.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter6.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter6.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter6.deserializeObjectState252();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter6.deserializeObjectState558();
        org.opentripplanner.routing.core.RoutingRequest routingRequest12 = state11.getOptions();
        stateData5.setopt(routingRequest12);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree15 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest12);
        org.opentripplanner.routing.core.StateData stateData16 = new org.opentripplanner.routing.core.StateData(routingRequest12);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(routingRequest12);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        org.opentripplanner.routing.core.StateData stateData11 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree13 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree14 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.247d + "'", double8 == 15.247d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState677();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState554();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1384();
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState813();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState747();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1144();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState823();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1790();
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState5();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1046();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex10 = serializedObjectSupporter0.deserializeObjectVertex15();
        java.util.Collection<org.opentripplanner.routing.graph.Edge> edgeCollection11 = intersectionVertex10.getOutgoing();
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
        org.junit.Assert.assertNotNull(edgeCollection11);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState598();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1994();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge12 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state13 = serializedObjectSupporter0.deserializeObjectState483();
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
        org.junit.Assert.assertNotNull(streetEdge12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1804();
        boolean boolean4 = state3.isFinal();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1762();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1649();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState839();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1197();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState125();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState61();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState830();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState681();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1775();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1770();
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState809();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState865();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1760();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex4();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter8 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter8.deserializeObjectState757();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter8.deserializeObjectState730();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter8.deserializeObjectState412();
        org.opentripplanner.routing.core.State state12 = serializedObjectSupporter8.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData13 = serializedObjectSupporter8.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state14 = serializedObjectSupporter8.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter8.deserializeObjectState142();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge16 = serializedObjectSupporter8.deserializeObjectEdge125();
        boolean boolean17 = intersectionVertex7.removeIncoming((org.opentripplanner.routing.graph.Edge) streetEdge16);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(stateData13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(streetEdge16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter3 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter3.deserializeObjectState757();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter3.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter3.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter3.deserializeObjectState1533();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter3.deserializeObjectState765();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter3.deserializeObjectState1506();
        org.opentripplanner.routing.core.State state10 = state2.addToExistingResultChain(state9);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter14 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state15 = serializedObjectSupporter14.deserializeObjectState757();
        org.opentripplanner.routing.core.State state16 = serializedObjectSupporter14.deserializeObjectState730();
        org.opentripplanner.routing.core.State state17 = serializedObjectSupporter14.deserializeObjectState412();
        org.opentripplanner.routing.core.State state18 = serializedObjectSupporter14.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData19 = serializedObjectSupporter14.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state20 = serializedObjectSupporter14.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state21 = serializedObjectSupporter14.deserializeObjectState1422();
        org.opentripplanner.routing.core.State state22 = serializedObjectSupporter14.deserializeObjectState1573();
        boolean boolean23 = org.opentripplanner.routing.spt.MultiShortestPathTree.dominates(state12, state22);
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
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertNotNull(state18);
        org.junit.Assert.assertNotNull(stateData19);
        org.junit.Assert.assertNotNull(state20);
        org.junit.Assert.assertNotNull(state21);
        org.junit.Assert.assertNotNull(state22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState846();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState897();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1869();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1627();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState850();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1802();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState510();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1302();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState593();
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
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState435();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1856();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1175();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState998();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1166();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState235();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1266();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1470();
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState507();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1903();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState999();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge86();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState446();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1692();
        org.opentripplanner.routing.core.StateData stateData8 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge9 = serializedObjectSupporter0.deserializeObjectEdge87();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(stateData8);
        org.junit.Assert.assertNotNull(streetEdge9);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1364();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState565();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1463();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1682();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1489();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1629();
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState457();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState515();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex42();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1110();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState961();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState555();
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState420();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState814();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1584();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState252();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState558();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = state5.getOptions();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree7 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.core.StateData stateData8 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.core.StateData stateData9 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.core.TraverseMode traverseMode10 = stateData9.backMode;
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertNull(traverseMode10);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1229();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState65();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge10 = serializedObjectSupporter0.deserializeObjectEdge40();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1719();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(streetEdge10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState297();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex6 = serializedObjectSupporter0.deserializeObjectVertex28();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1338();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState34();
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState267();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1743();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1076();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState749();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1093();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState568();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState745();
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState56();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1731();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState565();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.RoutingRequest routingRequest5 = state4.getOptions();
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree6 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest5);
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter7 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter7.deserializeObjectState757();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter7.deserializeObjectState730();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter7.deserializeObjectState412();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter7.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData12 = serializedObjectSupporter7.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData13 = serializedObjectSupporter7.deserializeObjectStateData2();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex14 = serializedObjectSupporter7.deserializeObjectVertex38();
        java.util.List<org.opentripplanner.routing.core.State> stateList15 = multiShortestPathTree6.getStates((org.opentripplanner.routing.graph.Vertex) intersectionVertex14);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(routingRequest5);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(stateData12);
        org.junit.Assert.assertNotNull(stateData13);
        org.junit.Assert.assertNotNull(intersectionVertex14);
        org.junit.Assert.assertNull(stateList15);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState843();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1135();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1371();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState31();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge57();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1599();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState989();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState411();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState601();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState457();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1234();
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1932();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1929();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState295();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState669();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState730();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState412();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState451();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex7 = serializedObjectSupporter0.deserializeObjectVertex38();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1479();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1132();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1757();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(intersectionVertex7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree12 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.opentripplanner.routing.core.StateData stateData13 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.247d + "'", double8 == 15.247d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter4 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter4.deserializeObjectStateData2();
        org.opentripplanner.routing.core.RoutingRequest routingRequest6 = stateData5.getopt();
        org.opentripplanner.routing.core.StateData stateData7 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree8 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        double double9 = streetEdge3.timeLowerBound(routingRequest6);
        org.opentripplanner.routing.core.StateData stateData10 = new org.opentripplanner.routing.core.StateData(routingRequest6);
        org.opentripplanner.routing.spt.MultiShortestPathTree multiShortestPathTree11 = new org.opentripplanner.routing.spt.MultiShortestPathTree(routingRequest6);
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(routingRequest6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 14.75d + "'", double9 == 14.75d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1381();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState511();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState527();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1051();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1677();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1487();
        org.opentripplanner.routing.core.StateData stateData12 = serializedObjectSupporter0.deserializeObjectStateData2();
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
        org.junit.Assert.assertNotNull(stateData12);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1752();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge119();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge42();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1427();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1728();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState166();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState458();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1640();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1884();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1482();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState261();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1804();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1468();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState365();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState818();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState801();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1033();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1765();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertNotNull(state10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState998();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge93();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState685();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1179();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge10();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState172();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge112();
        boolean boolean9 = streetEdge8.vertexTypesValid();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(streetEdge8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1115();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1469();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1292();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState887();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge54();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState907();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState219();
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1973();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1866();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState728();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge59();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1646();
        org.opentripplanner.routing.core.StateData stateData5 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState554();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState804();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex8 = serializedObjectSupporter0.deserializeObjectVertex3();
        com.vividsolutions.jts.geom.Coordinate coordinate9 = intersectionVertex8.getCoordinate();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(stateData5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(intersectionVertex8);
        org.junit.Assert.assertNotNull(coordinate9);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge55();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState336();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState876();
        ch.qos.logback.classic.Logger logger5 = serializedObjectSupporter0.deserializeObjectLogger1();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1139();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1326();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1759();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(logger5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState498();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1172();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1807();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState838();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1792();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1766();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState661();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1301();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1440();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge8 = serializedObjectSupporter0.deserializeObjectEdge132();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState1756();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState255();
        org.opentripplanner.routing.core.State state11 = serializedObjectSupporter0.deserializeObjectState1229();
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
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState394();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState97();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState469();
        org.opentripplanner.routing.core.StateData stateData4 = serializedObjectSupporter0.deserializeObjectStateData1();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1921();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState741();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState48();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1329();
        state8.checkNegativeWeight();
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge2 = serializedObjectSupporter0.deserializeObjectEdge137();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState425();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1566();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1173();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1353();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge7 = serializedObjectSupporter0.deserializeObjectEdge105();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState502();
        org.opentripplanner.routing.core.StateData stateData9 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(streetEdge2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(streetEdge7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(stateData9);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge3 = serializedObjectSupporter0.deserializeObjectEdge3();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1944();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge5 = serializedObjectSupporter0.deserializeObjectEdge106();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1130();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1562();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState1643();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState643();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(streetEdge3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(streetEdge5);
        org.junit.Assert.assertNotNull(state6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState717();
        org.opentripplanner.routing.vertextype.IntersectionVertex intersectionVertex2 = serializedObjectSupporter0.deserializeObjectVertex11();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1378();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge4 = serializedObjectSupporter0.deserializeObjectEdge126();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState823();
        org.opentripplanner.routing.core.StateData stateData6 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState1303();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(intersectionVertex2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(streetEdge4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(stateData6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState1028();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1755();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState930();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1205();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState1700();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge6 = serializedObjectSupporter0.deserializeObjectEdge121();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState496();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        java.lang.String str10 = state9.toStringVerbose();
        org.junit.Assert.assertNotNull(state1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
        org.junit.Assert.assertNotNull(state5);
        org.junit.Assert.assertNotNull(streetEdge6);
        org.junit.Assert.assertNotNull(state7);
        org.junit.Assert.assertNotNull(state8);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<State Tue Dec 07 11:25:48 BRT 2021 w=516.485 t=518 d=496.68500000000006 p=0 b=0 br=false pr=false>" + "'", str10, "<State Tue Dec 07 11:25:48 BRT 2021 w=516.485 t=518 d=496.68500000000006 p=0 b=0 br=false pr=false>");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.StateData stateData1 = serializedObjectSupporter0.deserializeObjectStateData2();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1114();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState45();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState627();
        org.junit.Assert.assertNotNull(stateData1);
        org.junit.Assert.assertNotNull(state2);
        org.junit.Assert.assertNotNull(state3);
        org.junit.Assert.assertNotNull(state4);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.opentripplanner.routing.spt.SerializedObjectSupporter serializedObjectSupporter0 = new org.opentripplanner.routing.spt.SerializedObjectSupporter();
        org.opentripplanner.routing.core.State state1 = serializedObjectSupporter0.deserializeObjectState757();
        org.opentripplanner.routing.core.State state2 = serializedObjectSupporter0.deserializeObjectState1067();
        org.opentripplanner.routing.core.State state3 = serializedObjectSupporter0.deserializeObjectState1635();
        org.opentripplanner.routing.core.State state4 = serializedObjectSupporter0.deserializeObjectState1930();
        org.opentripplanner.routing.core.State state5 = serializedObjectSupporter0.deserializeObjectState274();
        org.opentripplanner.routing.core.State state6 = serializedObjectSupporter0.deserializeObjectState1720();
        org.opentripplanner.routing.core.State state7 = serializedObjectSupporter0.deserializeObjectState767();
        org.opentripplanner.routing.core.State state8 = serializedObjectSupporter0.deserializeObjectState376();
        org.opentripplanner.routing.core.State state9 = serializedObjectSupporter0.deserializeObjectState268();
        org.opentripplanner.routing.core.State state10 = serializedObjectSupporter0.deserializeObjectState1974();
        org.opentripplanner.routing.edgetype.StreetEdge streetEdge11 = serializedObjectSupporter0.deserializeObjectEdge35();
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
        org.junit.Assert.assertNotNull(streetEdge11);
    }
}
